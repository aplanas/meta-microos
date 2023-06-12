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

RPM_NAME = "python310-numpy_1_24_2-gnu-hpc-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "3ed7ffaca3b8dec4e72d0db70df73abcdb658c37d1c71be67bd74a2c2018c0b977365e360efe9574f76d145ec6a67e7a8716028185a9840ee38a152413be7292"

RPROVIDES:${PN} += "python3-numpy_1_24_2-gnu-hpc python3.10dist(numpy) python310-numpy_1_24_2-gnu-hpc python310-numpy_1_24_2-gnu-hpc(aarch-64) python3dist(numpy)"
RDEPENDS:${PN} += "/usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libopenblas-gnu-hpc"

inherit rpm
