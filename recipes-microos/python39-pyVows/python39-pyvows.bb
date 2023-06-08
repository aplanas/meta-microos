SUMMARY = "BDD test engine based on Vows.js"
DESCRIPTION = "pyVows is a BDD test engine based on Vows.js <http://vowsjs.org>."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-pyVows-3.0.0-2.13.noarch.rpm"
RPM_HASH = "1ff10dd080a270f8d4c6b43268f9f5d703d72cea60458953cb2dbfa7908bcf9a932b4988e384f83687f1ee577d273decbf99790a7a56d93f7365627522ec5862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyvows) python39-pyVows python3dist(pyvows)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Unidecode python39-gevent python39-preggy update-alternatives"

inherit rpm
