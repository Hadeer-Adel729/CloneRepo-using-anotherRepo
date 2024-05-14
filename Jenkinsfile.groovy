pipeline {
    agent any
    
    stages {
        stage('Fetch and Execute') {
            steps {
                // Checkout the main branch to access Jenkinsfile
                checkout([$class: 'GitSCM', branches: [[name: 'main']], userRemoteConfigs: [[url: 'https://github.com/Hadeer-Adel729/CloudTask.git']]])

                // Checkout the master branch to access execute_ls.sh
                checkout([$class: 'GitSCM', branches: [[name: 'master']], userRemoteConfigs: [[url: 'https://github.com/Hadeer-Adel729/CloudTask.git']]])

                // Execute the execute_ls.sh script
                sh './execute_ls.sh'
            }
        }
    }
}
