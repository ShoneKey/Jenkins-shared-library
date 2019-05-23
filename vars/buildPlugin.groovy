import org.foo.groovy.pipeline.utils.*

def call(body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config


    // now build, based on the configuration provided
    node{
        body()
    }

}
