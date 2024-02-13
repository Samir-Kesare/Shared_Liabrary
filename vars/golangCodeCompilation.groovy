def call()
{
    
    sh 'go install' 
    sh "go list -f '{{.Target}}'" 
}
