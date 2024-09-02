def call() {
  def add_content = libraryResource "add.sh"
  def mul_content = libraryResource "mul.sh"
  writeFile file: add_script.sh, text: add_content
  writeFile file: mul_script.sh, text: mul_content
}
