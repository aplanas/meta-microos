SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-openmpi3-hpc-3.3.10-3.4.aarch64.rpm"
RPM_HASH = "c13503f0f08e1ce8715075e534a08ff096c731704e76430ba450cacab24c166dfefc0f9abf2d8e4b43faa8eee680efe6bd5d7e2f1ae13a4183009465f5951339"

RPROVIDES:${PN} += "fftw3 libfftw3_3_3_10-gnu-openmpi3-hpc libfftw3_3_3_10-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenmpi3-gnu-hpc lua-lmod"

inherit rpm
