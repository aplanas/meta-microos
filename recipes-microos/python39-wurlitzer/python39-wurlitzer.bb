SUMMARY = "Python package to capture C-level output in context managers"
DESCRIPTION = "Wurlitzer is a python package to capture C-level \
output in context managers."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python39-wurlitzer-3.0.3-1.3.noarch.rpm"
RPM_HASH = "7505cd40fb83bedcccef8bf459bb38cbd12c4dbef1e5cca0907155545d50f4b8f2c7ab447808dd70e028ebc62dd33bb2e8a707f41de654cf20dc39295b095ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wurlitzer) \
python39-wurlitzer \
python3dist(wurlitzer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
