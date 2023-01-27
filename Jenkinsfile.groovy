@Library('my-test-lib@main') _

node {
    
    stage("Hello World!") {
        def testvar = testvar.var2
        println "HelloWorld ${testvar}"
    }
}
