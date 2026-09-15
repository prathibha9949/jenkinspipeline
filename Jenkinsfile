pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                bat 'javac TestFactorial.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java TestFactorial'
            }
        }

        stage('Run') {
            steps {
                bat 'java TestFactorial'
            }
        }

        stage('Package JAR') {
            steps {
                bat 'jar cfe TestFactorial.jar TestFactorial TestFactorial.class'
            }
        }
    }
}