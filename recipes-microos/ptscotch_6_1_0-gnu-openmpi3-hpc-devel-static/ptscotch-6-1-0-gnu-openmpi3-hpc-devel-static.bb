SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi3-hpc-devel-static-6.1.0-2.7.aarch64.rpm"
RPM_HASH = "1a1f6a0059437dc7d7295d205ee92e3be20fea364f4b3b06023b7724d4cf82a96f80fd62f08a1365663b82e0bb31141baef1628e7f1ee69e90fed8cf4f9e2a1a"

RPROVIDES:${PN} += "ptscotch_6_1_0-gnu-openmpi3-hpc-devel-static \
ptscotch_6_1_0-gnu-openmpi3-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "ptscotch_6_1_0-gnu-openmpi3-hpc-devel"

inherit rpm
