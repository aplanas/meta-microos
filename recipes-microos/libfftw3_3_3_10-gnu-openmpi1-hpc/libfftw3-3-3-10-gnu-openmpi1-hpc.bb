SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-openmpi1-hpc-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "e15ebe574cb060b177408e666cecc0399cba67a38fa21ae787b2f2e0397faed0458457acc9741a81d8c80d26983ca8e66ef867a2b21bcc785f5d1dd66085e753"

RPROVIDES:${PN} += "fftw3 libfftw3_3_3_10-gnu-openmpi1-hpc libfftw3_3_3_10-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenmpi1-gnu-hpc lua-lmod"

inherit rpm
