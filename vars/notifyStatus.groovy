// vars/notifyStatus.groovy

def call(String status) {
    if (status == 'SUCCESS') {
        slackNotification.sendSuccessNotification()
    } else if (status == 'FAILURE') {
        slackNotification.sendFailureNotification()
    } else {
        println "Invalid status: $status"
    }
}

