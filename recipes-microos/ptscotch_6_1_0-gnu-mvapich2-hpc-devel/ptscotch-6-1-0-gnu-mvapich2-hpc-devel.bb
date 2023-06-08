SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-mvapich2-hpc-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "a9ea900bc1d49c880f010fe53f0053ab08c037b13252b3d3518d1629a77aa353337a0936df8594543d164bb50e951a5c3670073dfced148639e41f6a8a6501c7"

RPROVIDES:${PN} += "ptscotch_6_1_0-gnu-mvapich2-hpc-devel ptscotch_6_1_0-gnu-mvapich2-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgfortran.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libptscotch_6_1_0-gnu-mvapich2-hpc libz.so.1()(64bit) mvapich2-gnu-hpc-devel"

inherit rpm
