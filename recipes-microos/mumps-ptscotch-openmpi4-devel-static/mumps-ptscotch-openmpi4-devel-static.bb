SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-ptscotch-openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi4-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "159e2bd75240c2f3cbb7687b7f6c567cfd64116668a70061ff7655b10439d4a41a5eea12b781a5d5bb5c1b4f4b7fa7c28f01495c07629628ac1644c8800cd099"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi4-devel-static mumps-ptscotch-openmpi4-devel-static(aarch-64)"
RDEPENDS:${PN} += "mumps-ptscotch-openmpi4-devel"

inherit rpm
