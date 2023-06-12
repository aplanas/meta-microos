SUMMARY = "A patch parsing and application library"
DESCRIPTION = "A patch parsing and application library."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python311-whatthepatch-1.0.3-1.4.noarch.rpm"
RPM_HASH = "73b49cc72063f15c660e4522d1228e20a77d994a5f7e4683e0d733582b85878b01eb6f0f44c660f43f56ac69e2cae2b97c897c35d4c73dd8b68bcede53b4b45c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(whatthepatch) \
python311-whatthepatch \
python3dist(whatthepatch)"
RDEPENDS:${PN} += "ed \
patch \
python(abi)"

inherit rpm
