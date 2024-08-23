pipelineJob('app') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("http://gitlab/root/app.git")
                    }
                    branches('main')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
