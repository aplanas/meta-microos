SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi2-hpc-devel-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "19bd56f0e22979b358a06d46965d98fd7bcaaef464cc94e6085dd2f5e3042f984fe3695b936e5d1effb897200287a70a7795b851e6a20343f8fe65fedd99c24a"

RPROVIDES:${PN} += "ptscotch_6_1_0-gnu-openmpi2-hpc-devel ptscotch_6_1_0-gnu-openmpi2-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgfortran.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libptscotch_6_1_0-gnu-openmpi2-hpc libz.so.1()(64bit) openmpi2-gnu-hpc-devel"

inherit rpm
