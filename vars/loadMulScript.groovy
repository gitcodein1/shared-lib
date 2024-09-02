def call() {
  def mul_content = libraryResource "mul/mul.sh"
  writeFile file: "mul.sh", text: mul_content
}
