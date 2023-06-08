SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-openmpi1-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "0e5c088ce9eb147afc7783ca5f42537c659ca52568b2622c19124184569264d67e6ba14ea10812e2d4c560a0cade0c7a9bde59637feae56390221502e4fb3963"

RPROVIDES:${PN} += "libcmumps.so.5.3.5()(64bit) libdmumps.so.5.3.5()(64bit) libmumps5_3_5-openmpi1 libmumps5_3_5-openmpi1(aarch-64) libmumps_common$.so.5.3.5()(64bit) libpord.so.5.3.5()(64bit) libsmumps.so.5.3.5()(64bit) libzmumps.so.5.3.5()(64bit)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblacs.so.2.1.0()(64bit) libblacs2-openmpi1 libblas.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_10)(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) liblapack.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpi.so.12()(64bit) libmpi_mpifh.so.12()(64bit) libmpi_usempi_ignore_tkr.so.6()(64bit) libmpi_usempif08.so.11()(64bit) libscalapack.so.2.1.0()(64bit)"

inherit rpm
