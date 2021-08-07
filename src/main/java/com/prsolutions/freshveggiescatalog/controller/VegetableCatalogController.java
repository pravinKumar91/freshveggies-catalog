package com.prsolutions.freshveggiescatalog.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.prsolutions.freshveggiescatalog.model.CatalogItem;
import com.prsolutions.freshveggiescatalog.model.LocationShops;
import com.prsolutions.freshveggiescatalog.model.Shopping;
import com.prsolutions.freshveggiescatalog.model.Vegetable;

@RestController
@RequestMapping("/catalog")
public class VegetableCatalogController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webclientTemplate;
	
	@GetMapping("/{locationId}")
	public List<CatalogItem> getCatalog(@PathVariable("locationId") String locationId){
		//get all vegetable ids and its prices from the shops with quantity
		LocationShops locationsShop = restTemplate.getForObject("http://SHOPINFO/shopping/locations/"+locationId,LocationShops.class);
		List<Shopping> listShops = locationsShop.getListShops();
		//for each vegetable id call and get the details
		return listShops.stream().map(shop -> {
			Vegetable vegetable = restTemplate.getForObject("http://VEGETABLEINFO/veggies/"+shop.getVegetableId(), Vegetable.class);
/*			
			Vegetable vegetable = webclientTemplate.build()
					.get()
					.uri("http://localhost:2222/veggies/"+shop.getVegetableId())
					.retrieve()
					.bodyToMono(Vegetable.class)
					.block();
*/			
			return new CatalogItem(vegetable.getVegetableName(), vegetable.getVegetableDescription(), shop.getVegetablePrice(), shop.getVegetableQuantity(), shop.getShopName(), shop.getShopContact());
		}).collect(Collectors.toList());
	}
}
