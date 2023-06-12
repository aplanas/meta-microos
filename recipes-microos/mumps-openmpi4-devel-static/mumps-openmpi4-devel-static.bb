SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi4-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "4df221cf52d6326c06c8f09edd57be90d40e74117fbc143786054ef773a962c1b7c030682fda9c3f9cb86136a000812de1f49645736a99adc49ff53ed69b526a"

RPROVIDES:${PN} += "mumps-openmpi4-devel-static \
mumps-openmpi4-devel-static(aarch-64)"
RDEPENDS:${PN} += "mumps-openmpi4-devel"

inherit rpm
