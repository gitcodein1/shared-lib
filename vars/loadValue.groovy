def call(integer value1, integer value2) {
  def add_content = libraryResource "add.sh"
  writeFile file: add.sh, text: add_content
}
