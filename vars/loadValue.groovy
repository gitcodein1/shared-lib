def call(String script) {
  def add_content = libraryResource "add/${script}"
  writeFile file: script, text: add_content
}
/*def formul(String) {
  def mul_content = libraryResource "mul.sh"
  writeFile file: mul.sh, text: mul_content
  sh "cat mul.sh"
}*/
