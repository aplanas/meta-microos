SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libgfortran5-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "9103a68a9a4e6cd40707a4ebea1394aba3a81a6da88b8d3de3f0a0f6a8f5bf1d6ecab3557e7eb731056dc56363079b119f8b787b6b8290b7f37a609f44bba13d"

RPROVIDES:${PN} += "libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_10.2)(64bit) \
libgfortran.so.5(GFORTRAN_12)(64bit) \
libgfortran.so.5(GFORTRAN_13)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libgfortran.so.5(GFORTRAN_9)(64bit) \
libgfortran.so.5(GFORTRAN_9.2)(64bit) \
libgfortran.so.5(GFORTRAN_C99_8)(64bit) \
libgfortran.so.5(GFORTRAN_F2C_8)(64bit) \
libgfortran5 \
libgfortran5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
