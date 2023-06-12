SUMMARY = "Pure-python HTTP server"
DESCRIPTION = "Cheroot is the pure-Python HTTP server used by CherryPy."
LICENSE = "BSD-3-Clause"

PV = "9.0.0"

RPM_NAME = "python310-cheroot-9.0.0-3.1.noarch.rpm"
RPM_HASH = "199696408e78cf915782cd1cefa81378b70ee30fb04ba551a0aec8111adba349bcfa16a6e9a44f3104e955db2cf8dbb6b168d806a37c2f4c9d23011197f147cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Cheroot python3-cheroot python3.10dist(cheroot) python310-Cheroot python310-cheroot python3dist(cheroot)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts python(abi) python310-jaraco.functools python310-more-itertools"

inherit rpm
