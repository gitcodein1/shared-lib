def call(String) {
  def add_content = libraryResource "add.sh"
  writeFile file: add.sh, text: add_content
}
