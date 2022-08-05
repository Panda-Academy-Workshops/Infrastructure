pipelineJob('backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/Panda-Academy-Workshops/Backend.git")
                    }
                    branches('final')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
