SUMMARY = "Development files for librsb, a Recursive Sparse Blocks matrix format lirary"
DESCRIPTION = "librsb is a library for sparse matrix computations featuring the \
Recursive Sparse Blocks (RSB) matrix format. This format allows cache \
efficient and multi-threaded (that is, shared memory parallel) \
operations on large sparse matrices. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of librsb."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.0.1"

RPM_NAME = "librsb-devel-1.3.0.1-1.5.aarch64.rpm"
RPM_HASH = "91b9cf2a10906213ea48c41f10e0e1df25274916d87f4c034fd76a7e02d409d9a3fdd604e8b2aa8c340d3c9240a94cc7095160444f8e22c6e1932432aa47002a"

RPROVIDES:${PN} += "librsb-devel librsb-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgomp.so.1()(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) librsb.so.0()(64bit) librsb0"

inherit rpm
