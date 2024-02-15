package org.avengers.golang.unitTesting

def call() {
    stage('Install Go') {
        script {
            // Update apt packages
            sh 'sudo apt update'
            // Install Go using snap
            sh 'sudo snap install go --classic'
        }
    }
}
