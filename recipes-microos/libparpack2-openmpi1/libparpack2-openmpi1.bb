SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libparpack2-openmpi1-3.9.0-1.3.aarch64.rpm"
RPM_HASH = "eca472c0d63220ac9e4f9c8546bf2022a421d6ea303842dcf0aa3ed21cd69d6011e1415d40409c1cbd65251f169e351f298dc7d26e31b28cf05655215bbf785e"

RPROVIDES:${PN} += "libparpack.so.2()(64bit) libparpack2-openmpi1 libparpack2-openmpi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libarpack.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpi_mpifh.so.12()(64bit) libmpi_usempif08.so.11()(64bit) libopenblas.so.0()(64bit) openmpi1-libs"

inherit rpm
