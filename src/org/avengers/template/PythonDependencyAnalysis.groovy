package org.avengers.template

import org.avengers.common.*
import org.avengers.python.depedencyScanning.*

def call(String url, String creds, String branch){
   = new (version)
  gitCheckoutPrivate = new GitCheckoutPrivate()
   = new ()
  report = new ()

  .call(version)
  gitCheckoutPrivate.call(url, creds, branch)
  .call()
  report.call()
}
  
