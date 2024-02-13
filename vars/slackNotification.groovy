// vars/postSteps.groovy

def call(String status) {
    if (status == 'SUCCESS') {
            slackSend channel: 'jenkinss', message: 'Job Build successfully'
    }
    if (status == 'FAILURE'){
            slackSend channel: 'jenkinss', message: 'Job Failed '
    }
}


