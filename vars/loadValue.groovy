def foradd() {
  def add_content = libraryResource "add/add.sh"
  writeFile file: add.sh, text: add_content
  sh "cat add.sh"
}
def formul() {
  def mul_content = libraryResource "mul/mul.sh"
  writeFile file: mul.sh, text: mul_content
  sh "cat mul.sh"
}
