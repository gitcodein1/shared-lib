def formul(mulscript) {
  def mul_content = libraryResource "mul.sh"
  writeFile file: mulscript, text: mul_content
}
