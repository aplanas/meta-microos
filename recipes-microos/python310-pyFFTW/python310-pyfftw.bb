SUMMARY = "A pythonic wrapper around FFTW, the FFT library"
DESCRIPTION = "pyFFTW is a pythonic wrapper around the FFTW libary. \
An interface for all the possible transforms that FFTW can perform is provided. \
 \
Both the complex DFT and the real DFT are supported, as well as arbitrary \
axes of abitrary shaped and strided arrays, which makes it almost \
feature equivalent to standard and real FFT functions of ``numpy.fft`` \
(indeed, it supports the ``clongdouble`` dtype which ``numpy.fft`` does not). \
 \
Operating FFTW in multithreaded mode is supported. \
 \
A comprehensive unittest suite can be found with the source on the github \
repository."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.13.1"

RPM_NAME = "python310-pyFFTW-0.13.1-1.4.aarch64.rpm"
RPM_HASH = "52bb0c0bb1f37b40c29df60bd718b9b5b13613cfe82c5db355bbd94556d00cb3a0507b86fcc44415eec44117937bd0bb779c089a86390ec82b1ebeb7da330b24"

RPROVIDES:${PN} += "python3-pyFFTW python3.10dist(pyfftw) python310-pyFFTW python310-pyFFTW(aarch-64) python3dist(pyfftw)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfftw3.so.3()(64bit) libfftw3_threads.so.3()(64bit) libfftw3f.so.3()(64bit) libfftw3f_threads.so.3()(64bit) libfftw3l.so.3()(64bit) libfftw3l_threads.so.3()(64bit) python(abi) python310-dask python310-numpy python310-scipy"

inherit rpm
