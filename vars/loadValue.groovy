def call(value1,value2) {
  def add_content = libraryResource "add.sh"
  writeFile file: add.sh, text: add_content
  sh "bash add.sh ${value1} ${value2}"
}
