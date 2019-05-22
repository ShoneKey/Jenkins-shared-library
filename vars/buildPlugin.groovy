import org.foo.groovy.pipeline.utils.*

def call(body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    // now build, based on the configuration provided
    node {
//        git url: "https://github.com/jenkinsci/${config.name}-plugin.git"
//        sh "mvn install"
//        mail to: "...", subject: "${config.name} plugin build", body: "..."

        stage('test1'){
            log.info 'Starting'
            log.warning 'Nothing to do!'
        }
        stage('test2'){
            log.info 'Starting'
            log.warning 'Nothing to do!'
        }
        stage('test3'){
            log.info 'Starting'
            log.warning 'Nothing to do!'
        }
    }
}