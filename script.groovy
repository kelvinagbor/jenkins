def buildApp(){
   echo 'building the application...'
   sh 'mvn build'
}
def test(){
    echo 'Testing the Application...'
}
def deploy(){
   echo 'Deploying the application...' 
   echo "deploying version ${params.VERSION}"
}
 return this 