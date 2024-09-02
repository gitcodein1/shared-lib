def foradd(script) {
  def add_content = libraryResource "add/add.sh"
  writeFile file: script, text: add_content
}
