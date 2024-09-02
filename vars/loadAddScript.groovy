def foradd(addscript) {
  def add_content = libraryResource "add.sh"
  writeFile file: addscript, text: add_content
}
