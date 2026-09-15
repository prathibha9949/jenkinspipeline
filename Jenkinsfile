pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo "Checking out code"

                git branch: 'main',
                    url: 'https://github.com/prathibha9949/jenkins.git'
            }
        }

        stage('Compile') {
            steps {
                echo "Compile"

                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\javac.exe" TestFactorial.java'
            }
        }

        stage('Test') {
            steps {
                echo "Test"

                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\java.exe" TestFactorial'
            }
        }

        stage('Run') {
            steps {
                echo "Run"

                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\java.exe" TestFactorial'
            }
        }

        stage('Package JAR') {
            steps {
                echo "Creating JAR"

                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\jar.exe" cfe TestFactorial.jar TestFactorial TestFactorial.class'
            }
        }
    }

    post {

        success {
            echo "Build, test, run and JAR creation successful"
        }

        failure {
            echo "Build or test failed"
        }
    }
}