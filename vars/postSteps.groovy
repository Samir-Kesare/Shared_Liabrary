// vars/postSteps.groovy

def call() {
    return this
}

def success() {
    script {
        // Send Slack notification for success
        slackSend(
            color: '#36a64f',
            message: "Declarative Job completed successfully!",
            channel: "#jenkins",
            teamDomain: "demoworkspace-6868926",
            tokenCredentialId: "P0M8IV1MDogg1dcB2KozPGjB"
        )
    }
}

def failure() {
    script {
        // Send Slack notification for failure
        slackSend(
            color: '#ff0000',
            message: "Declarative Job failed!",
            channel: "#jenkins",
            teamDomain: "demoworkspace-6868926",
            tokenCredentialId: "P0M8IV1MDogg1dcB2KozPGjB"
        )
    }
}
