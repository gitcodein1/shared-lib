def call(check_script) {
  def content = libraryResource "check_file.sh"
  writeFile file: check_script, text: content
  sh "chmod +x ${check_script}"
}
