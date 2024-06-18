pipeline {
agent any
stages {
    stage('setup') {
        steps {
            browserstack(credentialsId: 'efe60a19-dd13-4ce7-8499-55b8db0fccff') {
                // For Linux-based systems, add the following commands in the given console to download the binary, run it, and stop its execution after the test has been executed.
                sh 'wget "https://www.browserstack.com/browserstack-local/BrowserStackLocal-linux-x64.zip"'
                sh 'unzip BrowserStackLocal-linux-x64.zip'
                sh './BrowserStackLocal --key $BROWSERSTACK_ACCESS_KEY --daemon start'
                sh '<your_test_commands>'
                sh './BrowserStackLocal --key $BROWSERSTACK_ACCESS_KEY --daemon stop'

                // For macOS-based systems, add the following commands in the given console to download the binary, run it, and stop its execution after the test has been executed.
                sh 'wget "https://www.browserstack.com/browserstack-local/BrowserStackLocal-darwin-x64.zip"'
                sh 'unzip BrowserStackLocal-darwin-x64.zip'
                sh './BrowserStackLocal --key $BROWSERSTACK_ACCESS_KEY --daemon start'
                sh '<your_test_commands>'
                sh './BrowserStackLocal --key $BROWSERSTACK_ACCESS_KEY --daemon stop'

                // For Windows-based systems, add the following commands in the given console to download the binary, run it, and stop its execution after the test has been executed.
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