pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/emrex32/bs-cadet'
            }
        }
        stage('compile') {
            steps {
                sh 'compile'
            }
        }
        stage('Run Tests'){
            steps{
                sh 'mvn test -P sample-test'
            }
        }
    }
    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}