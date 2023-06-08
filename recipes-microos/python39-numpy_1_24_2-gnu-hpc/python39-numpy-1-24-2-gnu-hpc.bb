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

RPM_NAME = "python39-numpy_1_24_2-gnu-hpc-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "d048d41fa211a4921a7ca1260bec743ee4b11bc83fe240f47d5cd0e2457bc44a84e38462f11b918c76543c673c2cce689b01322aad24ee7e41789a494bc3790f"

RPROVIDES:${PN} += "python3.9dist(numpy) python39-numpy_1_24_2-gnu-hpc python39-numpy_1_24_2-gnu-hpc(aarch-64) python3dist(numpy)"
RDEPENDS:${PN} += "/usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libopenblas-gnu-hpc"

inherit rpm
