SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for openmpi1."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi1-devel-static-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "16ec352e49405cd4fbdbae0754172cd9caa49998c0eb88dc75636ea7dcaac2c99d53d233003e4bf156aff85fb9a624ee49b44e2ee220f562235ce5f1fb9c65f1"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi1-devel-static-compat mumps-ptscotch-openmpi1-devel-static-compat(aarch-64)"
RDEPENDS:${PN} += "mumps-scotch-devel-static"

inherit rpm
