SUMMARY = "Python module for Libravatar"
DESCRIPTION = "PyLibravatar is a module for using federated Libravatar \
avatar hosting service from within Python applications."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python39-pyLibravatar-1.7-3.12.noarch.rpm"
RPM_HASH = "b3e2002d54fb09a00d3df3e809669717d7dce75f2438a6b91f9bda80d92e35f14e1299be93af26c78b63c4940fe4696ebb894722f023b674f65471c620760f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pylibravatar) python39-pyLibravatar python3dist(pylibravatar)"
RDEPENDS:${PN} += "python(abi) python39-py3dns"

inherit rpm
