SUMMARY = "Supplement packaging Python releases"
DESCRIPTION = "Tools to supplement packaging Python releases."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python310-jaraco.packaging-9.2.0-1.1.noarch.rpm"
RPM_HASH = "78ae51d1eb866d733c9c7aba2ccfb22584c89d908d33cb2fb9d89a2c4fd26b3256049b68a400cdc5091e2f02663f07df7dd00a79dbbdb067c135c5abd518924d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.packaging python3.10dist(jaraco.packaging) python310-jaraco.packaging python3dist(jaraco.packaging)"
RDEPENDS:${PN} += "python(abi) python310-build python310-jaraco.context python310-virtualenv"

inherit rpm
