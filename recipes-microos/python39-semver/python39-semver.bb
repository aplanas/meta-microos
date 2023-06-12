SUMMARY = "Python helper for Semantic Versioning"
DESCRIPTION = "A Python module for semantic versioning. Simplifies comparing versions. \
See also http://semver.org/"
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python39-semver-3.0.0-1.1.noarch.rpm"
RPM_HASH = "57b784bee9cb91b93bff796fef1e3ddac4b2b627c36db4ceb49e683c2790d176dc282ba587fa3324ff7f0f7a45481a0a70d9d37d2d2dca2b89003a0bb1dece58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(semver) python39-semver python3dist(semver)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
