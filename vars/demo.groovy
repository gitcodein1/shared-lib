def call() {
  def content = libraryResource "test.sh"
  writeFile file: "new.sh", text: content
  sh "bash new.sh"
}
