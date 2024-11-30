pipeline {
    agent any

    triggers {
        githubPush()  // Trigger the pipeline on GitHub push
    }

    environment {
        MAVEN_OPTS = '-Xms256m -Xmx512m'
    }

    tools {
        maven 'Maven 3.9.9'  // Name from Global Tool Configuration
        jdk 'JDK 11'         // Name from Global Tool Configuration
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'master', url: 'https://github.com/Himaz1/SeleniumPractice.git'
            }
        }

        stage('Build Project') {
            steps {
                script {
                    sh 'mvn clean install -DskipTests'
                }
            }
        }

        stage('Run Smoke Tests') {
            steps {
                script {
                    sh 'mvn clean test -DsuiteXmlFile=src/test/resources/testngSmoke.xml'
                }
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed.'
        }
        success {
            echo 'Tests passed successfully!'
        }
        failure {
            echo 'Tests failed!'
        }
    }
}
