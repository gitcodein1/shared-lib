def add(value1,value2) {
  loadValue.foradd("add.sh")
  sh "bash add.sh ${value1} ${value2}"
}
def mul(value1,value2) {
  loadValue.formul("add.sh")
  sh "bash add.sh ${value1} ${value2}"
}
