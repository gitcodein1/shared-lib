def call() {
  def add_content = libraryResource "add.sh"
  def mul_content = libraryResource "mul.sh"
  writeFile file: add.sh, text: add_content
  writeFile file: mul.sh, text: mul_content
}
