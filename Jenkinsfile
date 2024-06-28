pipeline {
  /*
   * TODO: Implement pipeline stages/steps
   *   See documentation: https://www.jenkins.io/doc/book/pipeline/syntax/#stages
   */
  name: Jenkinsfile Runner

on:
  push:
    branches:
      - '*'
  pull_request:
    branches:
      - '*'

jobs:
  jenkinsfile-runner:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout
        uses: actions/checkout@v2

      - name: Set up JDK 11
        uses: actions/setup-java@v1
        with:
          java-version: '11'

      - name: Install Jenkinsfile Runner
        run: |
          wget https://repo.jenkins-ci.org/releases/io/jenkins/jenkinsfile-runner/jenkinsfile-runner/1.0-beta-24/jenkinsfile-runner-1.0-beta-24.zip
          unzip jenkinsfile-runner-1.0-beta-24.zip -d jenkinsfile-runner

      - name: Run Jenkinsfile Runner
        run: |
          jenkinsfile-runner/bin/jenkinsfile-runner -w jenkinsfile-runner/war -p jenkinsfile-runner/plugins -f Jenkinsfile

}
