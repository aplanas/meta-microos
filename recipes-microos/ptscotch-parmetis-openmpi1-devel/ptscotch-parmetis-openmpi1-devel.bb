SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-parmetis-openmpi1-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "0659e6e36619b7d4aa9f0000ab62318d96bbcef454ad06d9d1309efe5a87b8e16db2f65aa9cb64b32b6d94e6b103c2c9403b40d6ab127f22b1a8b24711d40e68"

RPROVIDES:${PN} += "ptscotch-parmetis-openmpi1-devel ptscotch-parmetis-openmpi1-devel(aarch-64)"
RDEPENDS:${PN} += "libptscotch0-openmpi1 ptscotch-openmpi1-devel"

inherit rpm
