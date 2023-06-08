SUMMARY = "A tool to automatically upgrade syntax for newer versions"
DESCRIPTION = "A tool to automatically upgrade syntax for newer versions of the Python \
programming language."
LICENSE = "MIT"

PV = "3.2.2"

RPM_NAME = "python39-pyupgrade-3.2.2-1.4.noarch.rpm"
RPM_HASH = "535fa5f8ad1eba28d9b80a57aa6876685791160170daf0d76c5257eb8e07ddb07da32cfbee98658f6e199d50e5ec465d62003a629d9906512a95cb94c94db80f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyupgrade) python39-pyupgrade python3dist(pyupgrade)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-tokenize-rt update-alternatives"

inherit rpm
