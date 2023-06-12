SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi4-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "bc04dd8508cc6c4aeb555394c3e6d5dc5806a9c5e3e316df512c913233b064a793ede57e49da6ea61e9c7882df8d936ee04889b2f548c9b627b9f861c51a7fb0"

RPROVIDES:${PN} += "mumps-openmpi4-devel \
mumps-openmpi4-devel(aarch-64)"
RDEPENDS:${PN} += "libmumps5_3_5-openmpi4 \
mumps-devel \
openmpi4-devel \
scalapack-openmpi4-devel"

inherit rpm
