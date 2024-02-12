def call(string goal){
  sh 'mvn clean ${goal}'
}
