SUMMARY = "Symmetric Approximate Minimum Degree"
DESCRIPTION = "AMD is a set of routines for ordering a sparse matrix prior to \
Cholesky factorization (or for LU factorization with diagonal \
pivoting). There are versions in both C and Fortran. A MATLAB \
interface is provided. \
 \
Note that this software has nothing to do with AMD the company. \
 \
AMD is part of the SuiteSparse sparse matrix suite."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libamd2-2.4.6-49.1.aarch64.rpm"
RPM_HASH = "51cde8cd883efe452e35c798bd2927eb802dd1f339c6a6c0d511138d25bca86e2df94da752f716ce2ccec058324264e3d5309229729ecb5fcca272a49f5f060e"

RPROVIDES:${PN} += "libamd-2_4_6 \
libamd.so.2()(64bit) \
libamd2 \
libamd2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libsuitesparseconfig.so.5()(64bit)"

inherit rpm
