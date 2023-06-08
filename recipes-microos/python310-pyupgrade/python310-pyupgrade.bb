SUMMARY = "A tool to automatically upgrade syntax for newer versions"
DESCRIPTION = "A tool to automatically upgrade syntax for newer versions of the Python \
programming language."
LICENSE = "MIT"

PV = "3.2.2"

RPM_NAME = "python310-pyupgrade-3.2.2-1.4.noarch.rpm"
RPM_HASH = "39d9b26111a6b77b15724ddea89b93571d9a4e6415be578675e0aa1de2c41154f0dcc462eef398d86f93faa8beacb414e50feda0abfedd55a48bc418b0e02c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyupgrade python3.10dist(pyupgrade) python310-pyupgrade python3dist(pyupgrade)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-tokenize-rt update-alternatives"

inherit rpm
