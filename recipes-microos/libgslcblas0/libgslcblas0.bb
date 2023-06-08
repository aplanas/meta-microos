SUMMARY = "A standard C language APIs for BLAS from GNU Scientific Library"
DESCRIPTION = "This library provides a native C interface to BLAS routines. This is part of \
the GNU Scientific Library."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libgslcblas0-2.7.1-1.3.aarch64.rpm"
RPM_HASH = "4101236ff66505be1538aa04dc44c3f0329f64b31bc03a8c5c3e54afb9898f7b9918a773a5b1b54a182ce6f52e1190314ee27ab61a682444accf0378a18654af"

RPROVIDES:${PN} += "libgslcblas.so.0()(64bit) libgslcblas0 libgslcblas0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
