SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libparpack2-openmpi3-3.9.0-1.3.aarch64.rpm"
RPM_HASH = "11da8c9abacd6ab4ba1d2e47c4d2a510ac44560c0f8afdf69b5f602c7be439e02fa43acc7bc09b24186198e8d3479c5877abf43ae86e0128b6e3b314591eea0e"

RPROVIDES:${PN} += "libparpack.so.2()(64bit) libparpack2-openmpi3 libparpack2-openmpi3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libarpack.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpi_mpifh.so.40()(64bit) libopenblas.so.0()(64bit) openmpi3-libs"

inherit rpm
