pipeline {
    agent any

    stages {
        stage('Fetching the code') {
            steps {
                git credentialsId: '4e64eff0-83b6-4699-bfd7-3faf24692a6b', url: 'https://github.com/chetan211994/ATTBDDCucumberBasics.git'
            }
            post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'target/amazontestreport/reports.html', body: '''<h1>Hi Team,</h1>
<p>Please find the details of execution below:<br>

$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>

Check console output at $BUILD_URL to view the results.<br>

Thanks & Regards,<br>
Chetan''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customised email from jenkins for Chrome', to: 'beralchetan3210@gmail.com'
        }
    }
        }
        stage('Execute the project on Chrome') {
            steps {
                bat "mvn -Dmaven.test.failure.ignore=true test -DcliBrowser=Chrome"
            }
            post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'target/amazontestreport/reports.html', body: '''<h1>Hi Team,</h1>
<p>Please find the details of execution below:<br>

$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>

Check console output at $BUILD_URL to view the results.<br>

Thanks & Regards,<br>
Chetan''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customised email from jenkins for Firefox', to: 'beralchetan3210@gmail.com'
        }
    }
        }
        stage('Execute the project on Firefox') {
            steps {
                bat "mvn -Dmaven.test.failure.ignore=true test -DcliBrowser=Firefox"
            }
        }
        
    }
     
}