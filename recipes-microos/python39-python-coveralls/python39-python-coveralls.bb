SUMMARY = "Python interface to coveralls io API"
DESCRIPTION = "Python interface to coveralls.io API \
This package provides a module to interface with the https://coveralls.io API."
LICENSE = "Apache-2.0"

PV = "2.9.3"

RPM_NAME = "python39-python-coveralls-2.9.3-3.9.noarch.rpm"
RPM_HASH = "a6471122027b4ee4040b4590763b59b8b25a09ad86d7b201d40a037b833b5866fc11dd672de95d36b1ded611bbfe09f0055c78ba9ab08e1c4d98f1df83a97ea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-coveralls) python39-python-coveralls python3dist(python-coveralls)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-PyYAML python39-coverage python39-requests python39-six update-alternatives"

inherit rpm
