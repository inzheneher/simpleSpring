pipeline {
  agent any
  stages {
    stage("run frontend") {
      steps {
        echo 'executing yarn...'
        nodejs('Node-15-7') {
          sh 'yarn install'
        }
      }
    }
    stage("run backend") {
      steps {
        echo 'executing gradle...'
        withGradle() {
          sh './gradlew -v'
        }
      }
    }
  }
}
