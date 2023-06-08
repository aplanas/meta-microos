SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-mpich-hpc-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "ad4e977ed85ec48aaa7b875689b5302a36324f28b63135faa23216a5e722c222866671089f826ec0f4b43838c74168c5e45fd370a3dcfa1ba885c617023f2c3b"

RPROVIDES:${PN} += "fftw3 libfftw3_3_3_10-gnu-mpich-hpc libfftw3_3_3_10-gnu-mpich-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) lua-lmod mpich-gnu-hpc"

inherit rpm
