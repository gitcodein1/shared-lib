def call() {
  def add_content = libraryResource "add/add.sh"
  writeFile file: "new.sh", text: add_content
}
