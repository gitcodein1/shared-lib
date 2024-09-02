def test() {
  def content = libraryResource "test.sh"
  writeFile file: test.sh, text: content
  sh "bash test.sh"
}
