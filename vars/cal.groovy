def add(value1,value2) {
  loadAddScript.foradd("addscript")
  sh "./addscript ${value1} ${value2}"
}
def mul(value1,value2) {
  loadMulScript.formul("mulscript")
  sh "./mulscript ${value1} ${value2}"
}
