def add(value1,value2) {
  loadScript.foradd("addscript")
  sh "./addscript ${value1} ${value2}"
}
def mul(value1,value2) {
  loadScript.formul("mulscript")
  sh "./mulscript ${value1} ${value2}"
}
