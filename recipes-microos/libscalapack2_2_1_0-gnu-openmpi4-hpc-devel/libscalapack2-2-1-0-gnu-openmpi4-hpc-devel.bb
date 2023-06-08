SUMMARY = "Development libraries for ScaLAPACK (openmpi4)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi4-hpc-devel-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "940bed91d15d7af4b727ec626cb9bb1e504cce9fd9f78d4560eb7fdb21d940d805a699ee5114fa1758e4573da3f16d7cccd9febf50d10142b194f3aa2ffcf629"

RPROVIDES:${PN} += "libblacs2_2_1_0-gnu-openmpi4-hpc-devel libscalapack2_2_1_0-gnu-openmpi4-hpc-devel libscalapack2_2_1_0-gnu-openmpi4-hpc-devel(aarch-64) scalapack_2_1_0-gnu-openmpi4-hpc-devel"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenblas-gnu-hpc-devel libscalapack2_2_1_0-gnu-openmpi4-hpc openmpi4-gnu-hpc-devel"

inherit rpm
