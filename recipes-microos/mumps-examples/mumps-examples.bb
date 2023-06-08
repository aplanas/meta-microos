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

RPM_NAME = "mumps-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "81572214983f11d49406742b7b20d39687bb2b192b9b32c28b0674ff101a25dbedca5cf0e7fee14f0620a89f4a3243ba0ae249b429c8867fda37f2e16703cb1f"

RPROVIDES:${PN} += "mumps(examples)() mumps-examples mumps-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblas.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcmumps_seq.so.5.3.5()(64bit) libdmumps_seq.so.5.3.5()(64bit) libgcc_s.so.1()(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_10)(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) liblapack.so.3()(64bit) libm.so.6()(64bit) libmpiseq_seq.so.5.3.5()(64bit) libmumps5_3_5 libmumps_common.so.5.3.5()(64bit) libpord_seq.so.5.3.5()(64bit) libsmumps_seq.so.5.3.5()(64bit) libzmumps_seq.so.5.3.5()(64bit)"

inherit rpm
