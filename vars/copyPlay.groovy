def call() {
  loadPlay("play")
  sh "ansible-playbook play"
}
