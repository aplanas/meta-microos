SUMMARY = "Python module to produce formatted YAML-serialized data"
DESCRIPTION = "PyYAML-based python module to produce formatted YAML-serialized data."
LICENSE = "WTFPL"

PV = "21.10.1"

RPM_NAME = "python311-pyaml-21.10.1-1.8.noarch.rpm"
RPM_HASH = "e3c5eb9a4eb7b902654d23b1a7c79aaa7f83dea0c83801ecdec6ddf65e54d28d30f816347adfcadebc613d8300a1a2606042be797ff64eb57c6205383371397c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyaml) python311-pyaml python3dist(pyaml)"
RDEPENDS:${PN} += "python(abi) python311-PyYAML"

inherit rpm
