import org.foo.groovy.pipeline.utils.*

def call() {
    // evaluate the body block, and collect configuration into the object
//    def config = [:]
//    body.resolveStrategy = Closure.DELEGATE_FIRST
//    body.delegate = config


    // now build, based on the configuration provided
    node{
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
