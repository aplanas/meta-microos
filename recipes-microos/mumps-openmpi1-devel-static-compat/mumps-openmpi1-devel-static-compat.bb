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

RPM_NAME = "mumps-openmpi1-devel-static-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "b5bece5ae317a9a9758fb1cfe389c3bf9e56f4f54bbbf40ef1ebfd75a22dff35315bea008070162dc536506f134316d22b95c3ba40f393450842b5a9365a729f"

RPROVIDES:${PN} += "mumps-openmpi1-devel-static-compat \
mumps-openmpi1-devel-static-compat(aarch-64)"
RDEPENDS:${PN} += "mumps-devel-static"

inherit rpm
