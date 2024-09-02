def foradd(addscript) {
  def add_content = libraryResource "add/add.sh"
  writeFile file: addscript, text: add_content
}
def formul(mulscript) {
  def mul_content = libraryResource "mul/mul.sh"
  writeFile file: mulscript, text: mull_content
}
