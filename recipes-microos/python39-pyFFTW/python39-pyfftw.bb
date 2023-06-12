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

RPM_NAME = "python39-pyFFTW-0.13.1-1.4.aarch64.rpm"
RPM_HASH = "e2f32e30454be860cb2042b8bd1dc7f7b5900b7c4d7a36cbe1ad67ae11fbca9dac5343effe7af9e139bbf1391fadda26a9b425a3b6057e0be3b7878f2eb6da27"

RPROVIDES:${PN} += "python3.9dist(pyfftw) \
python39-pyFFTW \
python39-pyFFTW(aarch-64) \
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
python39-dask \
python39-numpy \
python39-scipy"

inherit rpm
