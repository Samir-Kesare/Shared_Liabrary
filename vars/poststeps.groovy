def call() {
    return {
        post {
            success {
                script {
                    // Send Slack notification for success
                    slackSend(
                        color: '#36a64f',
                        message: "Declarative Job completed successfully!",
                        channel: "#jenkins",
                        teamDomain: "demoworkspace-6868926",
                        tokenCredentialId: "e96c6c7f-1fdf-4c4a-80fd-5ad178092678"
                    )
                }
            }
            failure {
                script {
                    // Send Slack notification for failure
                    slackSend(
                        color: '#ff0000',
                        message: "Declarative Job failed!",
                        channel: "#jenkins",
                        teamDomain: "demoworkspace-6868926",
                        tokenCredentialId: "e96c6c7f-1fdf-4c4a-80fd-5ad178092678"
                    )
                }
            }
        }
    }
}
