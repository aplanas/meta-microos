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

RPM_NAME = "mumps-openmpi4-devel-static-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "3cb1b8e4c68a8fea7a6ab049c7cb168a98e9868417738e5a821c3a2161a5a46dcb42daf6550bc0216b8c2690ae06d55c2d9fb998da5d4409c3998667beb64ec3"

RPROVIDES:${PN} += "mumps-openmpi4-devel-static-compat mumps-openmpi4-devel-static-compat(aarch-64)"
RDEPENDS:${PN} += "mumps-devel-static"

inherit rpm
