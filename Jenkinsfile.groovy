pipeline {
    agent any    
    stages {
        stage('Execute ls command') {
            steps {
                script {
                    sh 'bash execute_is.sh'
                }
            }
        }
    }
}
