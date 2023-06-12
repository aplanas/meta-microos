SUMMARY = "C++ matrix library with interfaces to LAPACK and ATLAS"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
Various matrix decompositions are provided through optional \
integration with LAPACK and ATLAS libraries. \
A delayed evaluation approach is employed (during compile time) \
to combine several operations into one and reduce (or eliminate) \
the need for temporaries. This is accomplished through recursive \
templates and template meta-programming. \
 \
This package provides the shared libraries for armadillo."
LICENSE = "Apache-2.0"

PV = "12.2.0"

RPM_NAME = "libarmadillo12-12.2.0-1.1.aarch64.rpm"
RPM_HASH = "61112f5ed21b2a1c1753d120dd2ebfec54f5c9e8226ff29976c167efa722305a9fe471cbe1c903b2541c08a07afe8ded97896dccea5db9044642dd4682f4e366"

RPROVIDES:${PN} += "libarmadillo.so.12()(64bit) \
libarmadillo12 \
libarmadillo12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libarpack.so.2()(64bit) \
libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libsuperlu.so.6()(64bit)"

inherit rpm
