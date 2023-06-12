SUMMARY = "Test programs and examples for mumps"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This packages contains some test and examples programs for mumps. In addition, \
matlab and scilab extensions are provided in /usr/share/doc/packages/mumps."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-mvapich2-hpc-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "3db881f2cf58689b8b15bfb31f2a3538d27f5082741f1a4baf5fc7d907550421b38bc496325fcf645256f9aa0e83826fd889566f5ae20c1c24fa0a3f5dda1def"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-mvapich2-hpc-examples \
mumps_5_3_5-gnu-mvapich2-hpc-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libmumps_5_3_5-gnu-mvapich2-hpc"

inherit rpm
