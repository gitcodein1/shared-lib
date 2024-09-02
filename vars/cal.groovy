def add(value1,value2) {
  loadAddScript("addscript")
  sh "./addscript ${value1} ${value2}"
}
def mul(value1,value2) {
  loadMulScript("mulscript")
  sh "./mulscript ${value1} ${value2}"
}
