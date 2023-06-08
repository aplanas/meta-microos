SUMMARY = "Python port of material-color-utilities used for Material You colors"
DESCRIPTION = "Python port of material-color-utilities used for Material You colors."
LICENSE = "Apache-2.0"

PV = "0.1.5"

RPM_NAME = "python39-material-color-utilities-python-0.1.5-1.4.noarch.rpm"
RPM_HASH = "0de8b5c813e7be122db187284b1c41e69b4e7fde083b64b899ed61fb770d393b6fe9269ef67b290d7a438fb7f70de8dfc65255c1ed5fadd91b902621301bda45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(material-color-utilities-python) python39-material-color-utilities-python python3dist(material-color-utilities-python)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
