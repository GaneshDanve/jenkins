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
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            // 1. TestResults sathi
            junit testResults: 'target/surefire-reports/*.xml', allowEmptyResults: true
            
            // 2. HTML Report (Extent / Emailable Report) sathi
            publishHTML(target: [
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'test-output',
                reportFiles: 'emailable-report.html',
                reportName: 'HTML Test Report'
            ])
        }
    }
}