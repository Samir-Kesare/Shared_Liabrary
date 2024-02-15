package org.avengers.golang.dependencyScanning

def call(depVersion) {
    stage('Download Dependency Check') {
        script {
            sh "wget -q https://github.com/jeremylong/DependencyCheck/releases/download/v${depVersion}/dependency-check-${depVersion}-release.zip"
            sh "sudo apt insatll unzip -y"
            sh "unzip -q dependency-check-${depVersion}-release.zip"
        }
    }
}
