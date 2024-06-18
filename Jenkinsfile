pipeline {
agent any
stages {
    stage('setup') {
        steps {
            browserstack(credentialsId: 'efe60a19-dd13-4ce7-8499-55b8db0fccff') {
                sh 'mvn compile'
                sh 'mvn test -P sample-local-test'

            }
             // Enable reporting in Jenkins
             browserStackReportPublisher 'automate'

        }
    }
    }
}