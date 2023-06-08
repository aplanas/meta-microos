SUMMARY = "Supplement packaging Python releases"
DESCRIPTION = "Tools to supplement packaging Python releases."
LICENSE = "MIT"

PV = "9.1.2"

RPM_NAME = "python39-jaraco.packaging-9.1.2-2.1.noarch.rpm"
RPM_HASH = "9cf823b70fea03c82b1733592d26e74b09751f9e3c524929d4163220798f1413aa3e831d9c5e39baf73ae8c177f9a55eea6bb9fc3a98125d3eacc3af97000fdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.packaging) python39-jaraco.packaging python3dist(jaraco.packaging)"
RDEPENDS:${PN} += "python(abi) python39-build"

inherit rpm
