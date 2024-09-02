def call(String script) {
  def mul_content = libraryResource "mul/${script}"
  writeFile file: script, text: mul_content
}
