SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libparpack2-openmpi4-3.9.0-1.3.aarch64.rpm"
RPM_HASH = "afbb9a58b743e300499c95142c7ca280cf29d6a7168df9d30149f126a750db26d9b7f53d5d0ea553a8470f0604a515c3de3fbe46eee95603fee39b96eefd7e37"

RPROVIDES:${PN} += "libparpack.so.2()(64bit) \
libparpack2-openmpi4 \
libparpack2-openmpi4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarpack.so.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi_mpifh.so.40()(64bit) \
libopenblas.so.0()(64bit) \
openmpi4-libs"

inherit rpm
