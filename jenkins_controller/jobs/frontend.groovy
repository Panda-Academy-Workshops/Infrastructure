pipelineJob('frontend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/Panda-Academy-Workshops/Frontend.git")
                    }
                    branches('aws')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
