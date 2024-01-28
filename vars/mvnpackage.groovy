// vars/mvnpackage.groovy

def mvnpackage() {
    sh 'mvn clean package'
}
