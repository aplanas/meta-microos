SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "11.3.1+git2076"

RPM_NAME = "libgfortran5-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "1a3f9fc701ea8f3a6e738d1e166013e79f9b9a8de6932a59568444ddfff2cec6bffd375bf224a4374e9777e0b24075da732ab662c8908bd6fc7c96d48c73755e"

RPROVIDES:${PN} += "libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_10)(64bit) libgfortran.so.5(GFORTRAN_10.2)(64bit) libgfortran.so.5(GFORTRAN_12)(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libgfortran.so.5(GFORTRAN_9)(64bit) libgfortran.so.5(GFORTRAN_9.2)(64bit) libgfortran.so.5(GFORTRAN_C99_8)(64bit) libgfortran.so.5(GFORTRAN_F2C_8)(64bit) libgfortran5 libgfortran5-gcc11 libgfortran5-gcc11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
