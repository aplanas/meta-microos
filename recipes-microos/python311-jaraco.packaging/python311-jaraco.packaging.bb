SUMMARY = "Supplement packaging Python releases"
DESCRIPTION = "Tools to supplement packaging Python releases."
LICENSE = "MIT"

PV = "9.1.2"

RPM_NAME = "python311-jaraco.packaging-9.1.2-2.1.noarch.rpm"
RPM_HASH = "08bbc5741336d195ecc59be702c5a497e9c0d1554b7be66a67f5b2dbeeb63ab52a7d4d844ccff9f89d38e7d4069943519b17078d57bc0022981b1d7f2463c002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.packaging) python311-jaraco.packaging python3dist(jaraco.packaging)"
RDEPENDS:${PN} += "python(abi) python311-build"

inherit rpm
