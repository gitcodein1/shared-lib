def call(String addscript) {
  def add_content = libraryResource "add/${addscript}"
  writeFile file: addscript, text: add_content
}
