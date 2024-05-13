pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from version control
                git 'https://github.com/Hadeer-Adel729/CloudTask.git'
            }
        }

        stage('Execute Bash Script') {
            steps {
                // Execute your bash script
                sh './execute_ls.sh'
            }
        }
    }
}
