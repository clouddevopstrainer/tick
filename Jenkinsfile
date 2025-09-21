pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'Java17'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/your-username/walmart-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build & Push') {
            steps {
                sh '''
                docker build -t walmart-app:latest .
                '''
            }
        }

        stage('Deploy to Minikube') {
            steps {
                sh '''
                kubectl apply -f walmart-deployment.yaml
                kubectl get pods
                '''
            }
        }
    }
}
