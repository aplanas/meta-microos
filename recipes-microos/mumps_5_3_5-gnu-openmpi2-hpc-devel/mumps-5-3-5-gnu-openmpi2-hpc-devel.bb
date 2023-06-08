SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps_5_3_5-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi2-hpc-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "cc7631d65f6e7b95e5c5284d6d29ff9c2c0119ce3f0612ca9ac47ce567ffb8f4930aad0a8288e2043d46c70c76077ed7515cf7f3e20adaf86f5a74bf74266899"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-openmpi2-hpc-devel mumps_5_3_5-gnu-openmpi2-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_10)(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmumps_5_3_5-gnu-openmpi2-hpc libscalapack2-gnu-openmpi2-hpc-devel openmpi2-gnu-hpc-devel"

inherit rpm
