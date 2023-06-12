SUMMARY = "Documentation for python-bpython"
DESCRIPTION = "Documentation and help files for python-bpython."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python-bpython-doc-0.24-2.1.noarch.rpm"
RPM_HASH = "345a962d24775019d7ed63d5eca778fcbd806606bbbff5ff51334edb1e327829bda232e63dcc5ce259c38a865ece24eb89f839ef73f4d8f2debe7ff5bda28efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bpython-doc \
python310-bpython-doc \
python311-bpython-doc \
python39-bpython-doc"
RDEPENDS:${PN} += ""

inherit rpm
