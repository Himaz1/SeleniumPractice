pipeline {
    agent any  // This means the pipeline can run on any available agent

    environment {
        MAVEN_HOME = '/usr/bin/mvn' // Path to Maven in the Docker container
        MAVEN_OPTS = '-Xms256m -Xmx512m'
    }

    stages {
        stage('Checkout Code') {
            steps {
                // Checkout the code from GitHub
                git branch: 'master', url: 'https://github.com/Himaz1/SeleniumPractice.git'
            }
        }

        stage('Build Project') {
            steps {
                // Run Maven build command to compile the project
                script {
                    sh 'mvn clean install -DskipTests'
                }
            }
        }

        stage('Run Smoke Tests') {
            steps {
                // Run your smoke tests using the testng.xml suite file
                script {
                    sh 'mvn clean test -DsuiteXmlFile=src/test/resources/testngSmoke.xml'
                }
            }
        }
    }

    post {
        always {
            // Actions to always execute after the pipeline is finished
            echo 'Pipeline completed.'
        }
        success {
            // Actions to execute when the pipeline succeeds
            echo 'Tests passed successfully!'
        }
        failure {
            // Actions to execute if the pipeline fails
            echo 'Tests failed!'
        }
    }
}
