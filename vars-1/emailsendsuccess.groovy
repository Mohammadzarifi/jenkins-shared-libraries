def call() {
    emailext(
        attachLog: true, 
        body: "Pipeline test: ${JOB_URL}", 
        subject: "SUCCESSFUL JOB: Job name: ${JOB_NAME}", 
        to: 'recipient@example.com' 
    )
}
