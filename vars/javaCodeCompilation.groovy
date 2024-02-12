def call(String goal){
  sh 'mvn clean ${goal}'
}
