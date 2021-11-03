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
  stage('Email Notification'){
    mail bcc: '', body: '''Hello Pravin,

Job is successfully executed for maven clean package.

Thanks,
System''', cc: '', from: '', replyTo: '', subject: 'Jenkins Maven clean package Notification', to: 'pravinkumarwanare@gmail.com'
  }
}
