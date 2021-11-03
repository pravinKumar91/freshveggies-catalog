node {
  stage('SCM Checkout'){
    git 'https://github.com/pravinKumar91/freshveggies-catalog';
  }
  stage('Compile-Package'){
    bat 'mvn package';
  }
}
