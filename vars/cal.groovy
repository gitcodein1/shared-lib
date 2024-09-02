def add(value1,value2) {
  loadAddScript("addscript")
  sh "bash addscript ${value1} ${value2}"
}
def mul(value1,value2) {
  loadMulScript("mulscript")
  sh "bash mulscript ${value1} ${value2}"
}
