SUMMARY = "Development libraries for ScaLAPACK (openmpi1)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi1-hpc-devel-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "b40eb07fc938d0e09f3d2d1470a8123a36cedfe070ed49e75afdeef9ab513f69bfbb83175d57aeb5487ff50cdf2d6dbebeedc2784ac27e596c8d7b75cf969ed5"

RPROVIDES:${PN} += "libblacs2_2_1_0-gnu-openmpi1-hpc-devel \
libscalapack2_2_1_0-gnu-openmpi1-hpc-devel \
libscalapack2_2_1_0-gnu-openmpi1-hpc-devel(aarch-64) \
scalapack_2_1_0-gnu-openmpi1-hpc-devel"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenblas-gnu-hpc-devel \
libscalapack2_2_1_0-gnu-openmpi1-hpc \
openmpi1-gnu-hpc-devel"

inherit rpm
