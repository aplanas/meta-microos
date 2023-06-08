SUMMARY = "A toolset to deeply merge python dictionaries"
DESCRIPTION = "Python module to deeply merge python dictionaries."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python311-deepmerge-0.1.0-1.12.noarch.rpm"
RPM_HASH = "5797e5276a63d1047fa1c3a1518fb2b88938ae6bc7f0de6e5187e56cd33781fae9bdb39c3f0895136a4f96721ce1b4c3b4a420b8e66e7b8903b42d190619c38a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(deepmerge) python311-deepmerge python3dist(deepmerge)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
