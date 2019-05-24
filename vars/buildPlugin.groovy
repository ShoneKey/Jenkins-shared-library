import org.foo.groovy.pipeline.utils

def call(body) {
    //evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()


    // now build, based on the configuration provided
    node{
        stage('test1'){
            utils.info 'Starting'
            utils.warning 'Nothing to do!'
        }
        stage('test2'){
            utils.info 'Starting'
            utils.warning 'Nothing to do!'
        }
        stage('test3'){
            utils.info 'Starting'
            utils.warning 'Nothing to do!'
        }
    }

}
