def foradd(addscript) {
  def add_content = libraryResource "cal_script/add.sh"
  writeFile file: addscript, text: add_content
  sh "chmod +x ${addscript}"
}
def formul(mulscript) {
  def mul_content = libraryResource "cal_script/mul.sh"
  writeFile file: mulscript, text: mul_content
  sh "chmod +x ${mulscript}"
}
