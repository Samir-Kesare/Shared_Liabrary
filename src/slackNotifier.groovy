// src/slackNotifier.groovy

def slackNotification(String status) {
    if (status == 'SUCCESS') {
        slackSend channel: 'jenkinss', color: '#00FF00', message: 'Job Build successfully'
    } else if (status == 'FAILURE') {
        slackSend channel: 'jenkinss', color: '#FF0000', message: 'Job Failed'
    } else {
        echo "Unknown status: $status"
    }
}



