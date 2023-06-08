SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_omp3-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "c51a965e95242d7a7765c49b85ede041673046fc28ccc28eadd2064d514abe133a6e85fbc9a1a4883cd45f3940c44e27158b5c6317a6a6ec9cc04c5ec78142bb"

RPROVIDES:${PN} += "fftw3-openmp libfftw3_omp.so.3()(64bit) libfftw3_omp3 libfftw3_omp3(aarch-64) libfftw3f_omp.so.3()(64bit) libfftw3l_omp.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfftw3.so.3()(64bit) libfftw3f.so.3()(64bit) libfftw3l.so.3()(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit)"

inherit rpm
