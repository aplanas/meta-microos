SUMMARY = "Python diff wrapper"
DESCRIPTION = "Python diff wrapper."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-moreorless-0.4.0-1.3.noarch.rpm"
RPM_HASH = "f8991c159bab31b381c03e3d4903e94744e6c5aba834b2eb3939828519d66190f1aee20a715bf85e2cb177ebbc40c4e7bfe6af884b7335cda9c8dcb580409ced"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moreorless python3.10dist(moreorless) python310-moreorless python3dist(moreorless)"
RDEPENDS:${PN} += "python(abi) python310-click python310-volatile"

inherit rpm
