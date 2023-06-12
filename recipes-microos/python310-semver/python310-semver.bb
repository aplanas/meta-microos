SUMMARY = "Python helper for Semantic Versioning"
DESCRIPTION = "A Python module for semantic versioning. Simplifies comparing versions. \
See also http://semver.org/"
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python310-semver-3.0.0-1.1.noarch.rpm"
RPM_HASH = "3f1ff9767f66279a755e3fe8a7565e71aa71c4437ed83430d64e4ef2606eee77a5841713774ebfba9267e8a2ce47219ede898a951bafea267e61b810e895d5cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-semver python3.10dist(semver) python310-semver python3dist(semver)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
