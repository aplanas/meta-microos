SUMMARY = "Development libraries for ScaLAPACK (mpich)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against mpich."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-mpich-hpc-devel-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "1841294c3e3eba4c990e27265b98b46ab9b9483c412ce873b8d4973c4334ab941e6dcedecaf15c460aa258d49163316549c22424de9488291d3204bc5ef7a49c"

RPROVIDES:${PN} += "libblacs2_2_1_0-gnu-mpich-hpc-devel libscalapack2_2_1_0-gnu-mpich-hpc-devel libscalapack2_2_1_0-gnu-mpich-hpc-devel(aarch-64) scalapack_2_1_0-gnu-mpich-hpc-devel"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenblas-gnu-hpc-devel libscalapack2_2_1_0-gnu-mpich-hpc mpich-gnu-hpc-devel"

inherit rpm
