def call(String script) {
  def add_content = libraryResource "add/${script}"
  writeFile file: script, text: add_content
}
