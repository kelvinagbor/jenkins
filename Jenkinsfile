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
        stage('init'){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }
        stage('Build'){
            steps{
                script{
                    gv.buildApp()
                }
                
            }
        }
        stage('Test'){
            when{
                expression{
                    params.executeTests
                }
            }
            steps{
                script{
                    gv.test()
                }
            }
        }
        stage('deploy'){
            steps{
                script{
                    gv.deploy()
                }
            }
        }
        stage('Cleanup'){
            steps{
                echo "Cleanup testing"
            }
        }
    }
}
