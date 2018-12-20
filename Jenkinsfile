pipeline {

    agent any

    sh 'echo hola1'
    stages {

        agent {

            docker {

                image 'gradle:4.6.0-jdk8-alpine'
                args '-v $HOME/.gradle:/home/gradle/.gradle'
            }
        }
        stage('Build') {

            steps {

                sh 'echo hola'
                sh 'gradle build'
                sh 'gradle test'
            }
        }
    }
}