def installgo(){
  // Update apt packages
  sh 'sudo apt update' 
  // Install Go using snap
  sh 'sudo snap install go --classic'  
}

def testing(){
  // Run go test and ignore errors
  sh 'go test ./... || true'
}

def html(){
  // Run gotest with specify the output format and generate HTML Report
  sh 'go test ./... -coverprofile=coverage.out || true'
  sh 'go tool cover -html=coverage.out -o coverage.html || true'
}
