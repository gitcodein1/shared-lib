def add(value1,value2) {
  loadAddScript("add.sh")
  sh "bash add.sh ${value1} ${value2}"
}
def mul(value1,value2) {
  loadMulScript("mul.sh")
  sh "bash mul.sh ${value1} ${value2}"
}
