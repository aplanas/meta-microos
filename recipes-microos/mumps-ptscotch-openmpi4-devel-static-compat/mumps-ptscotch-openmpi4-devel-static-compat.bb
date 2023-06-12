SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi4-devel-static-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "c49e214900e9824adea2661539762987a1d4492a150fb0dbbf74143389f90c33b249fe5bbc4be9b5d01ef75744697577a8de3ce21c20ed5348d0f7cca2af8f33"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi4-devel-static-compat \
mumps-ptscotch-openmpi4-devel-static-compat(aarch-64)"
RDEPENDS:${PN} += "mumps-scotch-devel-static"

inherit rpm
