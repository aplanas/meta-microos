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

RPM_NAME = "python311-numpy-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "e9cb420efac8d6eac71b4d5748f30817f3c835b75426f346c7b2d6ad1ea38a52499bf0fe637033abf7f978ae0a469f56ba1838e53597e1b3bf10e2f53580cb5c"

RPROVIDES:${PN} += "python3.11dist(numpy) python311-numpy python311-numpy(aarch-64) python3dist(numpy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblas.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcblas.so.3()(64bit) liblapack.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) python(abi)"

inherit rpm
