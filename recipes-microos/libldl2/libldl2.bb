SUMMARY = "A Simple LDL^T Factorization"
DESCRIPTION = "LDL is a set of concise routines for factorizing symmetric positive- \
definite sparse matrices, with some applicability to symmetric \
indefinite matrices. Its primary purpose is to illustrate much of the \
basic theory of sparse matrix algorithms in as concise a code as \
possible, including an elegant new method of sparse symmetric \
factorization that computes the factorization row-by-row but stores \
it column-by-column. The entire symbolic and numeric factorization \
consists of a total of only 49 lines of code. The package is written \
in C, and includes a MATLAB interface. \
 \
LDL is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.6"

RPM_NAME = "libldl2-2.2.6-49.1.aarch64.rpm"
RPM_HASH = "a8e0e3f4b4d80b8e37638033924438ae7b52a7ac42e53cc05028ed4965099e43f02cbc06e5d8e69fa09209aeccff8ef4cfd5222b31e15e33a145d8c7e8646e78"

RPROVIDES:${PN} += "libldl-2_2_6 libldl.so.2()(64bit) libldl2 libldl2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
