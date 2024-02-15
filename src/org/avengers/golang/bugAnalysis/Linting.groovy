package org.avengers.golang.bugAnalysis

def call() {
    stage('Linting') {
        script {
            // Run golangci-lint and ignore errors
            sh 'golangci-lint run ./... || true'
        }
    }
}
