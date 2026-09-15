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
                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\javac.exe" TestFactorial.java'
            }
        }

        stage('Test') {
            steps {
                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\java.exe" TestFactorial'
            }
        }

        stage('Run') {
            steps {
                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\java.exe" TestFactorial'
            }
        }

        stage('Package JAR') {
            steps {
                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\jar.exe" cfe TestFactorial.jar TestFactorial TestFactorial.class'
            }
        }
    }
}