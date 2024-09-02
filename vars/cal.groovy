def call(integer value1, integer value2) {
  loadValue("add.sh")
  sh "bash add.sh ${value1} ${value2}"
}
