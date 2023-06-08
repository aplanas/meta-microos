SUMMARY = "Documentation for python-pyserial"
DESCRIPTION = "Documentation, examples, and help files for python-pyserial."
LICENSE = "Python-2.0"

PV = "3.5"

RPM_NAME = "python-pyserial-doc-3.5-3.1.noarch.rpm"
RPM_HASH = "f26060c56d5b6734404013e26fa728abab05535f8d9bd5bd7714f962038e15a6614edc984226ba58fcc18388194bdbdde0d3bdc7dbde043544f0013988e7484f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyserial-doc python2-pyserial-doc python3-pyserial-doc"
RDEPENDS:${PN} += ""

inherit rpm
