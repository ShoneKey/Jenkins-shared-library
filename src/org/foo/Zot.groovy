package org.foo


def checkOutForm(repo){
    git url:"git@github.com:jenkinsci/${repo}"

}

def echoP(){
    p=new Point()
    p.setPoint()
    p.echoPoint()
}

//echoP()
return this

