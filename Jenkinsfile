pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo "Checking out code"

                git branch: 'main',
                    url: 'https://github.com/prathibha9949/jenkinspipeline.git'
            }
        }

        stage('Compile') {
            steps {
                echo "Compiling Java program"

                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\javac.exe" TestFactorial.java'
            }
        }

        stage('Test') {
            steps {
                echo "Testing Java program"

                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\java.exe" TestFactorial'
            }
        }

        stage('Run') {
            steps {
                echo "Running Java program"

                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\java.exe" TestFactorial'
            }
        }

        stage('Package JAR') {
            steps {
                echo "Creating JAR file"

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