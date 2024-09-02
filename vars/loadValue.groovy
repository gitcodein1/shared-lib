def foradd(String script) {
  def add_content = libraryResource "add/${script}"
  writeFile file: script, text: add_content
}
def formul(String script) {
  def mul_content = libraryResource "mul/${script}"
  writeFile file: script, text: mul_content
}
