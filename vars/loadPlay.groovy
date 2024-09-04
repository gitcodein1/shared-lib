def call(play) {
  def content = libraryResource "play.yaml"
  writeFile file: play, text: content
}
