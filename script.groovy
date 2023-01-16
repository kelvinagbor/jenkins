def buildApp(){
   echo 'building the application...'
}
def test(){
    echo 'Testing the Application...'
}
def deploy(){
   echo 'Deploying the application...' 
   echo "deploying version ${params.VERSION}"
}
 return this 