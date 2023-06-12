SUMMARY = "Supplement packaging Python releases"
DESCRIPTION = "Tools to supplement packaging Python releases."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python39-jaraco.packaging-9.2.0-1.1.noarch.rpm"
RPM_HASH = "d221b75166acd168b0bbc6fc629e00621c20a22bc83de27bf3478eb32658a73e575a3a889696dce7a842740c91dd5246275ded37514df66f98b79072dfaded25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.packaging) \
python39-jaraco.packaging \
python3dist(jaraco.packaging)"
RDEPENDS:${PN} += "python(abi) \
python39-build \
python39-jaraco.context \
python39-virtualenv"

inherit rpm
