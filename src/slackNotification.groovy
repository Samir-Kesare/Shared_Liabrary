// src/slackNotification.groovy

def sendSuccessNotification() {
    slackSend channel: 'jenkinss', color: '#00FF00', message: 'Job Build successfully'
}

def sendFailureNotification() {
    slackSend channel: 'jenkinss', color: '#FF0000', message: 'Job Failed'
}
