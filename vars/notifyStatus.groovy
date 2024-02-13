// vars/notifyStatus.groovy

def call(String status) {
    if (status == 'SUCCESS') {
        sendSuccessNotification()
    } else if (status == 'FAILURE') {
        sendFailureNotification()
    } else {
        println "Invalid status: $status"
    }
}


