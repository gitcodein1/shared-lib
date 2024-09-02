def call(String script) {
  def add_content = libraryResource "add/add.sh"
  writeFile file: "add.sh", text: add_content
}
