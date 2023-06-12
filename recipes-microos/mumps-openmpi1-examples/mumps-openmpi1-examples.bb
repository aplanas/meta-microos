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

RPM_NAME = "mumps-openmpi1-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "cd5ab9d3e3fda656367777f3cfea2cee5fd860e985063ea9965ff0bff9a0706274cc8c92a988ba119c886b012f9ee3581f39904e3ff78210b221135a98011025"

RPROVIDES:${PN} += "mumps(examples)(openmpi) \
mumps-openmpi1-examples \
mumps-openmpi1-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblacs.so.2.1.0()(64bit) \
libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcmumps.so.5.3.5()(64bit) \
libdmumps.so.5.3.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmpi.so.12()(64bit) \
libmpi_mpifh.so.12()(64bit) \
libmpi_usempi_ignore_tkr.so.6()(64bit) \
libmpi_usempif08.so.11()(64bit) \
libmumps5_3_5-openmpi1 \
libmumps_common$.so.5.3.5()(64bit) \
libpord.so.5.3.5()(64bit) \
libscalapack.so.2.1.0()(64bit) \
libsmumps.so.5.3.5()(64bit) \
libzmumps.so.5.3.5()(64bit)"

inherit rpm
