node {
  stage('SCM Checkout'){
    git 'https://github.com/pravinKumar91/freshveggies-catalog';
  }
  stage('Clean-Package'){
    bat 'mvn clean';
  }
  stage('Compile-Package'){
    bat 'mvn package';
  }
}
