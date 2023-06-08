SUMMARY = "SLIP LU, A Sparse Left-Looking Integer Preserving LU Factorization"
DESCRIPTION = "SLIP LU is software package used to solve a sparse systems of linear equations \
exactly using the Sparse Left-looking Integer-Preserving LU factorization. \
 \
SLIP LU solves a sparse system of linear equations using a given input \
matrix and right hand side vector file. This code can output the final \
solution to a user specified output file in either double precision or \
full precision rational numbers. If you intend to use SLIP LU within \
another program, refer to examples for help with this. \
 \
SLIP LU is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "libsliplu1-1.0.2-49.1.aarch64.rpm"
RPM_HASH = "06dd146117d8ff42847785f0f7d0054fd8a5610d63fd3a4ace7276e498c351fbd96a3233ab1ac89cf2f01cfd37a9ff55c1a478b57ac99da1173e59abcfa9a34c"

RPROVIDES:${PN} += "libsliplu-1_0_2 libsliplu.so.1()(64bit) libsliplu1 libsliplu1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libamd.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcolamd.so.2()(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpfr.so.6()(64bit) libsuitesparseconfig.so.5()(64bit)"

inherit rpm
