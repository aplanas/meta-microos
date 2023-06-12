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

RPM_NAME = "mumps-ptscotch-openmpi1-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "5f118739797e92953861709bb8db84d2fa476f8bfe64277e5b02e9ae6d3f8884b12bf78761a076775b984d2060d2f85f7c377fd2ef4758a47d6327a096d6ace0"

RPROVIDES:${PN} += "mumps(examples)(openmpi) \
mumps-ptscotch-openmpi1-examples \
mumps-ptscotch-openmpi1-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblacs.so.2.1.0()(64bit) \
libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcmumps_ptscotch.so.5.3.5()(64bit) \
libdmumps_ptscotch.so.5.3.5()(64bit) \
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
libmumps-ptscotch5_3_5-openmpi1 \
libmumps_common.so.5.3.5()(64bit) \
libpord_ptscotch.so.5.3.5()(64bit) \
libptesmumps.so.0()(64bit) \
libptscotch.so.0()(64bit) \
libptscotcherr.so.0()(64bit) \
libscalapack.so.2.1.0()(64bit) \
libscotch.so.0()(64bit) \
libsmumps_ptscotch.so.5.3.5()(64bit) \
libzmumps_ptscotch.so.5.3.5()(64bit)"

inherit rpm
