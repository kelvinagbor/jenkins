pipeline{
    agent any
<<<<<<< HEAD
=======
    environment{
        version = '8.3.7'
        configuration = 'prodcution'
    }
>>>>>>> main
    stages{
        stage('Build'){
            steps{
                  echo "build testing"
                  echo "This build is version ${version}"
            }
        }
        stage('Test'){
            steps{
                echo "Test testing"
            }
        }
        stage('deploy'){
<<<<<<< HEAD
=======
            BRANCH_NAME = 'main'
>>>>>>> main
            steps{
                echo "Deploy testing"
                echo "Deploying ${configuration}_${version}"
            }
        }
        stage('Cleanup'){
            steps{
                echo "Cleanup testing"
            }
        }
    }
}