pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build and Test'){
			tools{
				maven 'M3'
			}
		
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit testResults: 'target/surefire-reports/*.xml',
                  allowEmptyResults: true
        }
    }
}