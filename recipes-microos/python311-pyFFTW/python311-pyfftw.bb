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

RPM_NAME = "python311-pyFFTW-0.13.1-1.4.aarch64.rpm"
RPM_HASH = "25f3fc5b725846b7f143b048c381766833e327aed1717daf4af02fbbc4988118b9ff71a41e5c9a42d4e794f26db5913990a4d71a559ed0834bca3b87485dd555"

RPROVIDES:${PN} += "python3.11dist(pyfftw) \
python311-pyFFTW \
python311-pyFFTW(aarch-64) \
python3dist(pyfftw)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfftw3.so.3()(64bit) \
libfftw3_threads.so.3()(64bit) \
libfftw3f.so.3()(64bit) \
libfftw3f_threads.so.3()(64bit) \
libfftw3l.so.3()(64bit) \
libfftw3l_threads.so.3()(64bit) \
python(abi) \
python311-dask \
python311-numpy \
python311-scipy"

inherit rpm
