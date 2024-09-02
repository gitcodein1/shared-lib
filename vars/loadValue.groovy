def foradd(String addscript) {
  def add_content = libraryResource "add/${addscript}"
  writeFile file: addscript, text: add_content
}
def formul(String mulscript) {
  def mul_content = libraryResource "mul/${mulscript}"
  writeFile file: mulscript, text: mul_content
}
