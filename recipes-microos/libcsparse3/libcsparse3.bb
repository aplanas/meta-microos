SUMMARY = "Instructional Sparse Matrix Package"
DESCRIPTION = "CSparse is a small yet feature-rich sparse matrix package written \
specifically for a book. The purpose of the package is to demonstrate \
a wide range of sparse matrix algorithms in as concise a code as \
possible. CSparse is about 2,200 lines long (excluding its MATLAB \
interface, demo codes, and test codes), yet it contains algorithms \
(either asympotical optimal or fast in practice) for all of the \
following functions described below. A MATLAB interface is included. \
 \
Note that the LU and Cholesky factorization algorithms are not as \
fast as UMFPACK or CHOLMOD. Other functions have comparable \
performance as their MATLAB equivalents (some are faster). \
 \
Documentation is very terse in the code; it is fully documented in \
the book. Some indication of how to call the C functions in CSparse \
is given by the CSparse/MATLAB/*.m help files. \
 \
CSparse is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.0"

RPM_NAME = "libcsparse3-3.2.0-49.1.aarch64.rpm"
RPM_HASH = "d5bf12686cd1de40b8eaa04d5bf895a56a79334b35692d780e926af5e1597bc1bdd445b107d3a5ed88a525a95da314a1806825a33f09e77ad379b6d6a7f07cb8"

RPROVIDES:${PN} += "libcsparse-3_2_0 libcsparse.so.3()(64bit) libcsparse3 libcsparse3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
