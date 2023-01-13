pipeline{
    agent any
    environment{
        version = '8.3.7'
        configuration = 'prodcution'
    }
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
            BRANCH_NAME = 'main'
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