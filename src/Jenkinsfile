pipeline {
    agent any

    environment {
        JAVA_HOME = "C:\\Program Files\\Java\\jdk-17"  // adapte selon ton JDK
        PATH = "${JAVA_HOME}\\bin;${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/amorostodizara/jenkinsfile.git'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compilation du projet Java...'
                bat 'javac HelloWorld.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Exécution du programme...'
                bat 'java HelloWorld'
            }
        }
    }

    post {
        success {
            echo 'Pipeline terminé avec succès ✅'
        }
        failure {
            echo 'Pipeline échoué ❌'
        }
    }
}
