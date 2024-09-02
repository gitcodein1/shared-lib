def foradd(String) {
  def add_content = libraryResource "add.sh"
  writeFile file: add.sh, text: add_content
  sh "cat add.sh"
}
/*def formul(String) {
  def mul_content = libraryResource "mul.sh"
  writeFile file: mul.sh, text: mul_content
  sh "cat mul.sh"
}*/
