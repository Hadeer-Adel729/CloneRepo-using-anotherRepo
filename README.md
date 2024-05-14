# Cloud-task

Task1
------
1-install jenkins
2-complete configuration
3-create admin user
[to install Jenkins:(https://www.youtube.com/watch?v=NCFJjwWj90s)]

4-create a pipeline that executes and prints "Hello world"
to create a New Pipeline Project:
-------------
-Click on "New Item" on the Jenkins dashboard.
-Enter a name for your pipeline project, select "Pipeline", and click "OK".
-Define Pipeline Script:
-Scroll down to the Pipeline section, select "Pipeline script" from the Definition dropdown.
-In the script area, paste the following code:
pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                echo 'Hello world'
            }
        }
    }
}
-Save the Pipeline: Click on "Save" to save your pipeline configuration
-Click on "Build Now" to start the pipeline execution.

//==================================================================

Task2
-----
1-Create bash script file that executes the "Is" command -> (the 'ls command is written in 'execute_ls.sh' file in master branch)
2-Push the bash file into a newly created repo
3-Create a new pipeline item on jenkins 
4-Create a CI/CD for this by configuring jenkins to pull the repo and execute the bash file:
---
-In your Jenkins dashboard, click on your pipeline project.
-Click on "Configure" to edit the pipeline settings.
-Scroll down to the "Pipeline" section and configure the following:-
.Definition: Pipeline script from SCM
.SCM: Select Git and provide your repository URL.
.Set the branch to */master.
.Script Path: Enter the path to your Jenkinsfile, typically Jenkinsfile. -> (the script is written in 'Jenkinsfile' in master branch)
.Save your changes.
