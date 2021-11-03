node {
  stage('SCM Checkout'){
    git 'https://github.com/pravinKumar91/freshveggies-catalog';
  }
  stage('Compile-Package'){
    sh 'mvn package';
  }
}
