SUMMARY = "Python helper for Semantic Versioning"
DESCRIPTION = "A Python module for semantic versioning. Simplifies comparing versions. \
See also http://semver.org/"
LICENSE = "BSD-3-Clause"

PV = "3.0.0~dev.4"

RPM_NAME = "python311-semver-3.0.0~dev.4-1.2.noarch.rpm"
RPM_HASH = "5d2dd11e190048bd251cbaaada06a140532a5f3375e677b49de1e3697eb4365b7c69fe7ed05d267998ff57b309d1dafc3aa265068af261b7cc05993812b8e7f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(semver) python311-semver python3dist(semver)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
