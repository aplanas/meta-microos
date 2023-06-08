SUMMARY = "Python API for MISP"
DESCRIPTION = "PyMISP is a Python library to access MISP platforms via their REST API. \
 \
PyMISP allows you to fetch events, add or update events/attributes, add or update samples or search for attributes."
LICENSE = "BSD-2-Clause"

PV = "2.4.166"

RPM_NAME = "python39-pymisp-2.4.166-1.4.noarch.rpm"
RPM_HASH = "0b3c4895cbde8abd940cec41d1d000c77573536afca77827c9cfbd15682dd612d69c19da06701f5813e90b447c95d627edfb856af11fe579445907bd67da8c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pymisp) python39-pymisp python3dist(pymisp)"
RDEPENDS:${PN} += "python(abi) python39-Deprecated python39-jsonschema python39-oletools python39-python-dateutil python39-requests"

inherit rpm
