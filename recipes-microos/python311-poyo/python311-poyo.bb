SUMMARY = "YAML Parser for Python"
DESCRIPTION = "A YAML Parser for Python. \
 \
Please note that Poyo supports only a chosen subset of the YAML format. \
 \
It can only read but not write and is not compatible with JSON. \
 \
Poyo does not allow deserialization of arbitrary Python objects. Supported \
types are str, bool, int, float, NoneType as well as dict and list values."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-poyo-0.5.0-1.14.noarch.rpm"
RPM_HASH = "518d4ee9feb2b494c53365052dd205f23ceb205f6baf3ae1282c3fe28cead8ad417b42d9f677712bf52c57da38f86b60e26c12d50bec8467853ed4d81f62ce28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(poyo) python311-poyo python3dist(poyo)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
