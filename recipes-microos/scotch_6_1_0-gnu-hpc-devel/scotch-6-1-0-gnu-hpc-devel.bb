SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch_6_1_0-gnu-hpc-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "1ec30a619b3761bc35d8b2f83d4ad1e378088d3eb384e06f99e02c4a1a756184f9ed8969d201467f48a3a521f3132909ac6e3176f5bb054b53f32e7fd9cdb79c"

RPROVIDES:${PN} += "scotch_6_1_0-gnu-hpc-devel \
scotch_6_1_0-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgfortran.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libscotch_6_1_0-gnu-hpc \
libz.so.1()(64bit)"

inherit rpm
