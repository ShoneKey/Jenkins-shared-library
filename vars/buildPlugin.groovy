import org.foo.groovy.pipeline.utils.*

def call(body) {
    //evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()


    // now build, based on the configuration provided
    node{
        stage('test1'){
            info 'Starting'
            warning 'Nothing to do!'
        }
        stage('test2'){
            info 'Starting'
            warning 'Nothing to do!'
        }
        stage('test3'){
            info 'Starting'
            warning 'Nothing to do!'
        }
    }

}
