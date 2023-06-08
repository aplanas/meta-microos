SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.0.1+git7231"

RPM_NAME = "libgfortran5-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "2bfd3135a04ccb1ba21b611b737f1580c4480e8d099122bd16bc3bcb4697b752e2f735e48eb89d7ea4747e70ccc34778bdbc6af240a6a2069ce1dd496c42bca2"

RPROVIDES:${PN} += "libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_10)(64bit) libgfortran.so.5(GFORTRAN_10.2)(64bit) libgfortran.so.5(GFORTRAN_12)(64bit) libgfortran.so.5(GFORTRAN_13)(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libgfortran.so.5(GFORTRAN_9)(64bit) libgfortran.so.5(GFORTRAN_9.2)(64bit) libgfortran.so.5(GFORTRAN_C99_8)(64bit) libgfortran.so.5(GFORTRAN_F2C_8)(64bit) libgfortran5 libgfortran5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
