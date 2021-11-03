node {
  stage('SCM Checkout'){
    git 'https://github.com/pravinKumar91/freshveggies-catalog';
  }
  stage('Clean-Package'){
    def mvnHome = tool name: 'Maven3', type: 'maven';
    bat "${mvnHome}/bin/mvn clean";
  }
  stage('Compile-Package'){
    bat 'mvn package';
  }
}
