SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-ptscotch-openmpi1."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi1-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "861d7672ec4a1fb8e5a4061c2836945b248ba0c102a8dc5075ccf89e86f1d8a17761fe2340856bf3d2c1a1c8a971beea7b1717600efcb1eeb9ece06b90af00af"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi1-devel mumps-ptscotch-openmpi1-devel(aarch-64)"
RDEPENDS:${PN} += "libmumps-ptscotch5_3_5-openmpi1 mumps-devel mumps-scotch-devel openmpi1-devel ptscotch-openmpi1-devel scalapack-openmpi1-devel"

inherit rpm
