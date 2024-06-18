pipeline {
agent any
stages {
    stage('setup') {
        steps {
            browserstack(credentialsId: 'efe60a19-dd13-4ce7-8499-55b8db0fccff') {
                sh 'wget "https://www.browserstack.com/browserstack-local/BrowserStackLocal-win32.zip"'
                sh 'powershell.exe Expand-Archive BrowserStackLocal-win32.zip'
                sh './BrowserStackLocal-win32/BrowserStackLocal.exe --key %BROWSERSTACK_ACCESS_KEY% --daemon start'
                git 'https://github.com/emrex32/bs-cadet'
                sh 'mvn compile'
                sh 'mvn test -P sample-local-test'
                sh './BrowserStackLocal --key %BROWSERSTACK_ACCESS_KEY% --daemon stop'

            }
             // Enable reporting in Jenkins
             browserStackReportPublisher 'automate'

        }
    }
    }
}