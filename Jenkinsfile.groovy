pipeline {
    agent any
    stages {
        stage('Execute ls command') {
            steps {
                script {
                    bat 'dir execute_ls.sh'
                }
            }
        }
    }
}
