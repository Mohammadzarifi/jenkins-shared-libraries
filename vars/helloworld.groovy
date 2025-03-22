def call(String name) {
    if (!name?.trim()) {
        error("Invalid input: Name cannot be null or empty.")
    }
    sh "echo ${name} this is Jenkins shared library listing"
}
