pipeline {
    agent any

    environment {
        // Si Maven est configuré dans Jenkins
        MVN_HOME = "C:\\apache-maven-3.9.11"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/amorostodizara/jenkinsfile.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Compilation du projet...'
                bat "${env.MVN_HOME}\\bin\\mvn clean compile"
            }
        }

        // stage('Unit Tests') {
        //     steps {
        //         echo 'Exécution des tests unitaires...'
        //         bat "${env.MVN_HOME}\\bin\\mvn test"
        //     }
        //     post {
        //         always {
        //             junit '**/target/surefire-reports/*.xml'
        //         }
        //     }
        // }

        stage('Package') {
            steps {
                echo 'Création du package...'
                bat "${env.MVN_HOME}\\bin\\mvn package"
            }
        }
    }

    post {
        success {
            echo 'Build réussi !'
        }
        failure {
            echo 'Build échoué !'
        }
    }
}
