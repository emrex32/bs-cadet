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
                mvn 'compile'
            }
        }
        stage('Run Tests'){
            steps{
                mvn 'test -P sample-test'
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