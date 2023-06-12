SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-parmetis-openmpi4-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "e519f70b45ce31b098a77522fe2230d75f1fe70de2098491f2156befec0c6d7130bfa14d3c8154a125fce8e51daabcc67abf067a9d3499f3ac3051f56593f83c"

RPROVIDES:${PN} += "ptscotch-parmetis-openmpi4-devel \
ptscotch-parmetis-openmpi4-devel(aarch-64)"
RDEPENDS:${PN} += "libptscotch0-openmpi4 \
ptscotch-openmpi4-devel"

inherit rpm
