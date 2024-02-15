package org.avengers.golang.unitTesting

def call() {
    stage('Generate HTML Report') {
        script {
              // Run gotest with specify the output format and generate HTML Report
              sh 'go test ./... -coverprofile=coverage.out || true'
              sh 'go tool cover -html=coverage.out -o coverage.html || true'
        }
    }
}
