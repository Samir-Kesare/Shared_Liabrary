def checkoutStage() {
    stage("Git Checkout") {
        steps {
            git branch: 'main', url: 'https://github.com/Parasharam-Desai/salary-api.git'
        }
    }
}

def bugAnalysisStage() {
    stage("Bug Analysis") {
        steps {
            sh 'mvn compile'
            sh 'mvn spotbugs:spotbugs'
            sh 'mvn site'
        }
    }
}

def htmlReportStage() {
    stage('Publish HTML Report') {
        steps {
            publishHTML(target: [
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/site',
                reportFiles: 'spotbugs.html',
                reportName: 'SpotBugs Report'
            ])
        }
    }
}

