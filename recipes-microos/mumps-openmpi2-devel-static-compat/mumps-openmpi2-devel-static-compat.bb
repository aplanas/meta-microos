SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for openmpi2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi2-devel-static-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "a6f963334c749c72ad563fccef95cd41406d8cc3c44ae80876f3b0e5e6e83367fa0592e860cc6f3983ea91f56cd8a26fde939b5df93683dfccc1e80fec7644cc"

RPROVIDES:${PN} += "mumps-openmpi2-devel-static-compat mumps-openmpi2-devel-static-compat(aarch-64)"
RDEPENDS:${PN} += "mumps-devel-static"

inherit rpm
