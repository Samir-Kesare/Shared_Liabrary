// vars/postSteps.groovy

def call(String status) {
    if (${status} == 'FAILURE')
    slackSend channel: 'jenkinss', message: 'Job Failed '
    if (${status} == 'SUCCESS') 
    slackSend channel: 'jenkinss', message: 'Job Build successfully'
}


