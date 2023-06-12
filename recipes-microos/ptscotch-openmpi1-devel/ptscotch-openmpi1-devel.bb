SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi1-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "cde8598c03259f971e44ef31fca6c90176b20e615840c670ca33d080c13878aceea94f49bde42dcbb541a4a977244f88883b6d52dd72512ff576c9bc87ce5716"

RPROVIDES:${PN} += "ptscotch-openmpi1-devel \
ptscotch-openmpi1-devel(aarch-64)"
RDEPENDS:${PN} += "gcc-fortran \
libptscotch0-openmpi1 \
openmpi1-devel \
scotch-devel"

inherit rpm
