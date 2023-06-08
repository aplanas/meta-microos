SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-ptscotch-openmpi3."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi3-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "83d996d3471f3d88dc492f7a51478a82e5370c67738c240c0b2a92d720ce7ff7f9cc5e0c0e54bc301df1031a4efc773a0315876ccf74fdad5be423190386a8cc"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi3-devel-static mumps-ptscotch-openmpi3-devel-static(aarch-64)"
RDEPENDS:${PN} += "mumps-ptscotch-openmpi3-devel"

inherit rpm
