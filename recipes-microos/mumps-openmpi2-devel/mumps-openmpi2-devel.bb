SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-openmpi2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi2-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "2a4f39e3f2aed542e6ec5dfde96f7807265ce606c6c24c61d50a0a862597923ecdb453ab83b2468b768e1be9b884c4f19a8855ac6f1d02914ec67963bd18693e"

RPROVIDES:${PN} += "mumps-openmpi2-devel \
mumps-openmpi2-devel(aarch-64)"
RDEPENDS:${PN} += "libmumps5_3_5-openmpi2 \
mumps-devel \
openmpi2-devel \
scalapack-openmpi2-devel"

inherit rpm
