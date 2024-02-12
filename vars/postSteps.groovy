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
            channel: "#slacknotification",
            teamDomain: "demoworkspace-6868926",
            tokenCredentialId: "h1N9SN1RzhqJoKkB4MpwE3xb"
        )
    }
}

def failure() {
    script {
        // Send Slack notification for failure
        slackSend(
            color: '#ff0000',
            message: "Declarative Job failed!",
            channel: "#slacknotification",
            teamDomain: "demoworkspace-6868926",
            tokenCredentialId: "h1N9SN1RzhqJoKkB4MpwE3xb"
        )
    }
}
