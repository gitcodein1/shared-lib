def addition(value1,value2) {
  loadValue.addition("add.sh")
  sh "bash add.sh ${value1} ${value2}"
}
