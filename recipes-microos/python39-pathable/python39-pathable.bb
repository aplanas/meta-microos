SUMMARY = "Object-oriented paths"
DESCRIPTION = "Python object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python39-pathable-0.4.3-3.1.noarch.rpm"
RPM_HASH = "0879d357d09e705274b1ce6120dc2bbbe44dc9573293f61bd622eadaab323ad44f31edff77d880b650fa44d57feff33252eee564839b8a30f06da426fdd50815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pathable) python39-dictpath python39-pathable python3dist(pathable)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
