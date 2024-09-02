def call(Map values = [:]) {
  loadValue("add.sh")
  sh "bash add.sh ${values.value1} ${values.value2}"
}
