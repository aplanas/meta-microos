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

RPM_NAME = "python311-numpy-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "5215da95d7484fbe8a182d63a74a023a678fdcf50f409b8188a48b427fdb54116babc498047d86a2133197efb53be3aaac8e48e64b1371aed074dce2b106f6d8"

RPROVIDES:${PN} += "python3.11dist(numpy) python311-numpy python311-numpy(aarch-64) python3dist(numpy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblas.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcblas.so.3()(64bit) liblapack.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) python(abi)"

inherit rpm
