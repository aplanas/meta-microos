SUMMARY = "Development libraries for OpenBLAS, gnu-hpc-pthreads version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas-pthreads_0_3_21-gnu-hpc-devel-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "7c7cbe745c17c905820611c70e0ad7ccc6caf2dc157ad1348488b3b740f8ee12cc3e5079063301d0ce85d2803b6ae046784f79039b44cb3c3c60dc87f3763544"

RPROVIDES:${PN} += "libopenblas-pthreads_0_3_21-gnu-hpc-devel libopenblas-pthreads_0_3_21-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenblas-pthreads_0_3_21-gnu-hpc"

inherit rpm
