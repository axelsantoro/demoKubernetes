pipeline {

    agent any

    stages {

        stage('Build') {

            when {

                expression { BRANCH_NAME ==~ /(master)/ }
            }
            steps {

                sh 'gradle build'
            }
        }
        stage('Unit Test') {

            agent {

                docker {

                    image 'gradle:4.6.0-jdk8-alpine'
                    args '-v $HOME/.gradle:/home/gradle/.gradle'
                }
            }
            steps {

                sh 'gradle test'
            }
        }
    }
}