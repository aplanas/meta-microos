SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-ptscotch-openmpi3."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi3-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "021ef72148b3afd868064f921ddf2347cee7644fa54f65782556525446464529deff2c2ece63196eb32ec2344d7be05d9128c1e3793cd481083bb6c68c26a380"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi3-devel mumps-ptscotch-openmpi3-devel(aarch-64)"
RDEPENDS:${PN} += "libmumps-ptscotch5_3_5-openmpi3 mumps-devel mumps-scotch-devel openmpi3-devel ptscotch-openmpi3-devel scalapack-openmpi3-devel"

inherit rpm
