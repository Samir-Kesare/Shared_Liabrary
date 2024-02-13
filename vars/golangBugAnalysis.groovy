def installpre-requisites(){
  // Update apt packages
  sh 'sudo apt update'
  // Install Go using snap
  sh 'sudo snap install go --classic'
  // Remove golangci-lint using snap
  sh 'sudo snap remove golangci-lint || true'
  // Install GolangCI-lint
  sh 'go install github.com/golangci/golangci-lint/cmd/golangci-lint@latest'
  // Add $HOME/go/bin to PATH
  env.PATH += ":$HOME/go/bin"
}

def linting(){
  // Run golangci-lint and ignore errors
  sh 'golangci-lint run ./... || true'
}

def html(){
  // Run golangci-lint with the --out-format option to specify the output format
  sh 'golangci-lint run ./... --out-format html > report.html || true'
}
