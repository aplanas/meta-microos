SUMMARY = "Python helper for Semantic Versioning"
DESCRIPTION = "A Python module for semantic versioning. Simplifies comparing versions. \
See also http://semver.org/"
LICENSE = "BSD-3-Clause"

PV = "3.0.0~dev.4"

RPM_NAME = "python310-semver-3.0.0~dev.4-1.2.noarch.rpm"
RPM_HASH = "d3b97951b3ba697ac7f3980fdbff51d43b636d78800c60b630feab0d11bebe11587bc9ec0a09a287d1fe0096b52ee8eb8849e73ae982862f79d1badd7ed3c1e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-semver python3.10dist(semver) python310-semver python3dist(semver)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
