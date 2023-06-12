SUMMARY = "NumPy array processing for numbers, strings, records and objects"
DESCRIPTION = "NumPy is a general-purpose array-processing package designed to \
efficiently manipulate large multi-dimensional arrays of arbitrary \
records without sacrificing too much speed for small multi-dimensional \
arrays.  NumPy is built on the Numeric code base and adds features \
introduced by numarray as well as an extended C-API and the ability to \
create arrays of arbitrary type which also makes NumPy suitable for \
interfacing with general-purpose data-base applications. \
 \
There are also basic facilities for discrete fourier transform, \
basic linear algebra and random number generation."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python310-numpy-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "13fbf183c17a292c2b9abb0b88692010fc9317b66ed41f79ece1cfd93885aa0059e6b5e127e2f6cd7da1473ce2e6f8619d59895fce6a0053c463a0cde71496d7"

RPROVIDES:${PN} += "python3-numpy python3.10dist(numpy) python310-numpy python310-numpy(aarch-64) python3dist(numpy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblas.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcblas.so.3()(64bit) liblapack.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) python(abi)"

inherit rpm
