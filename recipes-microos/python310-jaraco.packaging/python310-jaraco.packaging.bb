SUMMARY = "Supplement packaging Python releases"
DESCRIPTION = "Tools to supplement packaging Python releases."
LICENSE = "MIT"

PV = "9.1.2"

RPM_NAME = "python310-jaraco.packaging-9.1.2-2.1.noarch.rpm"
RPM_HASH = "389e253a830eb9ef1e0b2685c130f71e614b50f2ff7191ac1e24a4d6dda7f42c0c82ff1fbdf8c9f4074c025d2336a13a46b11bdb62d3717f130e3c4c168560eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.packaging python3.10dist(jaraco.packaging) python310-jaraco.packaging python3dist(jaraco.packaging)"
RDEPENDS:${PN} += "python(abi) python310-build"

inherit rpm
