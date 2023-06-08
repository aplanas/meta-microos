SUMMARY = "MATLAB Toolbox for Reading/Writing Sparse Matrices"
DESCRIPTION = "RBio is a MATLAB toolbox for reading/writing sparse matrices in the \
Rutherford/Boeing format, and for reading/writing problems in the UF \
Sparse Matrix Collection from/to a set of files in a directory. \
Version 2.0+ is written in C. \
 \
RBio is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.6"

RPM_NAME = "librbio2-2.2.6-49.1.aarch64.rpm"
RPM_HASH = "b6a352f88ec121899efc0cf1173bf6ed496cc7e246ce8df09b075c859169ce3f77534e7db1e7aaecf3d0f3116bb9cc906ac0c7c08eaf0eb737e903ad0d9326d6"

RPROVIDES:${PN} += "librbio-2_2_6 librbio.so.2()(64bit) librbio2 librbio2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsuitesparseconfig.so.5()(64bit)"

inherit rpm
