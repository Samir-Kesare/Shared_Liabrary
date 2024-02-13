// src/SlackNotification.groovy

def call(String status) {
    if (status == 'SUCCESS') {
            slackSend channel: 'jenkinss', message: 'Job Build Successfully'
    }
    if (status == 'FAILURE'){
            slackSend channel: 'jenkinss', message: 'Job Failed'
    }
}


