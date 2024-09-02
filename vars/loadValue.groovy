def call(String script) {
  def add_content = libraryResource "add/${script}"
  def mul_content = libraryResource "mul/${script}"
  writeFile file: script, text: add_content
  writeFile file: script, text: mul_content
}
