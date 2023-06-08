SUMMARY = "Python helper for Semantic Versioning"
DESCRIPTION = "A Python module for semantic versioning. Simplifies comparing versions. \
See also http://semver.org/"
LICENSE = "BSD-3-Clause"

PV = "3.0.0~dev.4"

RPM_NAME = "python39-semver-3.0.0~dev.4-1.2.noarch.rpm"
RPM_HASH = "6ab35b6b8873109352b913d655827e8e8b0f24ae7e927bf223dbd23c5567324278aa5290c88cd5bd4a89c880db891738be7ac165953aa316ae6cca4b8f5da90a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(semver) python39-semver python3dist(semver)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
