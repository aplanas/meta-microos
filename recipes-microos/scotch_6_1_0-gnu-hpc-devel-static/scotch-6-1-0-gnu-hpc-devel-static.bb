SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch_6_1_0-gnu-hpc-devel-static-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "e3411a50c278262216271d64ab9f95e3b4be2e96c85166d43d6a49fbbbf445b9e1ac75a9d9b5e367d1cfcdb905af9a36ea5d1ebe50c1ae77d0c17ac731f00f77"

RPROVIDES:${PN} += "scotch_6_1_0-gnu-hpc-devel-static scotch_6_1_0-gnu-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "scotch_6_1_0-gnu-hpc-devel"

inherit rpm
