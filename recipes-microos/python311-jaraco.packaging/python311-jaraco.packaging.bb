SUMMARY = "Supplement packaging Python releases"
DESCRIPTION = "Tools to supplement packaging Python releases."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python311-jaraco.packaging-9.2.0-1.1.noarch.rpm"
RPM_HASH = "aea8bf3cabd8abfa62bf3cc841af81077537ab429674fff530f52c4e4e82e486a4adfd446148839ced241b2312795535a83eaef880841a58e868bdbbc1b62485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.packaging) python311-jaraco.packaging python3dist(jaraco.packaging)"
RDEPENDS:${PN} += "python(abi) python311-build python311-jaraco.context python311-virtualenv"

inherit rpm
