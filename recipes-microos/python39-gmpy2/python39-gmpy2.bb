SUMMARY = "GMP/MPIR, MPFR, and MPC interface to Python 2.6+ and 3x"
DESCRIPTION = "gmpy2 is a C-coded Python extension module that supports \
multiple-precision arithmetic. In addition to supporting \
GMP or MPIR for multiple-precision integer and rational \
arithmetic, gmpy2 adds support for the MPFR (correctly \
rounded real floating-point arithmetic) and MPC (correctly \
rounded complex floating-point arithmetic) libraries."
LICENSE = "LGPL-3.0-only"

PV = "2.1.5"

RPM_NAME = "python39-gmpy2-2.1.5-2.1.aarch64.rpm"
RPM_HASH = "6c9a41b001d3ab2940153208c4407fa3cbae0e6756a606276045cb24481fad3535f188027c444a1e738520a184ebb050ef246f044983378ad2b3736d6ad859e1"

RPROVIDES:${PN} += "python3.9dist(gmpy2) python39-gmpy2 python39-gmpy2(aarch-64) python3dist(gmpy2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) python(abi)"

inherit rpm
