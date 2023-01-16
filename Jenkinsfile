def gv

pipeline{
    agent any
    parameters{
         choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'different build versions')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
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
