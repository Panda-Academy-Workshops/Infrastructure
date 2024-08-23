pipelineJob('deploy') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/Panda-Academy-Workshops/gitlab_pipelines")
                    }
                    branches('main')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}