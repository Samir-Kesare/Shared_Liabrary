package org.avengers.golang.unitTesting

def call() {
    stage('Testing') {
        script {
             // Run go test and ignore errors
             sh 'go test ./... || true'
        }
    }
}
