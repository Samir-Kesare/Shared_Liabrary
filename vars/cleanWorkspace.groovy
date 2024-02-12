// Will not clean workspace if build is Sucessful 
def call() {
  cleanWs cleanWhenSuccess: false
}
