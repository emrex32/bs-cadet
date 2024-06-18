pipeline {
agent any
stages {
    stage('setup') {
        steps {
            browserstack(credentialsId: 'efe60a19-dd13-4ce7-8499-55b8db0fccff', localConfig: [localOptions: '-forcelocal', localPath: 'C:\\Users\\cadehali\\Desktop\\BrowserStackLocal-win32\\BrowserStackLocal.exe']) {

                sh 'mvn compile'
                sh 'mvn test -P sample-local-test'
                //sh 'C:\Users\cadehali\Desktop\BrowserStackLocal-win32 --key %BROWSERSTACK_ACCESS_KEY% --daemon stop'

            }
             // Enable reporting in Jenkins
             browserStackReportPublisher 'automate'

        }
    }
    }
}