SUMMARY = "Visual regression testing library"
DESCRIPTION = "Python client library for visual regression testing with Percy."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-percy-2.0.2-1.13.noarch.rpm"
RPM_HASH = "1ef49736fc43f69e2ac3b9b2e4b3c8177e0e10ae67541d176acb3d5bfcd522116909a40fbf54e634c8c99883824f53461616e5d4f963b7d7c1b338380f038d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(percy) python39-percy python3dist(percy)"
RDEPENDS:${PN} += "python(abi) python39-requests"

inherit rpm
