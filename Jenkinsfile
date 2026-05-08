pipeline {
    agent any

    stages {

        stage('Clone Code') {
            steps {
                git 'https://github.com/Jegatha1407/ConverterProject.git'
            }
        }

        stage('Compile Java') {
            steps {
                bat 'javac TemperatureConverter.java'
            }
        }

        stage('Compile Tests') {
            steps {
                bat 'javac -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" TemperatureConverterTest.java'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore CurrencyConverterTest'
            }
        }
    }

    post {
        success {
            echo 'BUILD SUCCESSFUL'
        }
        failure {
            echo 'BUILD FAILED'
        }
    }
}