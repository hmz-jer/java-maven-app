def buildJar() {
    echo "building the application..."
    sh 'mvn package'
}

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t localhost:8082/docker-hosted/java-maven-app:1.0 .'
        sh "echo $PASS | docker login localhost:8082 -u $USER --password-stdin"
        sh 'docker push localhost:8082/docker-hosted/java-maven-app:1.0'
    }
}

def deployApp() {
    echo 'deploying the application...'
}

return this
