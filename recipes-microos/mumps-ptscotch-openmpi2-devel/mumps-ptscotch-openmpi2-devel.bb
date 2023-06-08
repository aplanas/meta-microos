SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-ptscotch-openmpi2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi2-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "8d05e0b978a25dfc8a02a8c2ce145b32061dcd675320ea78514e863ad6b35040dff4a5db25ab386412bcb67d1f1a86c97e70800fe54522d15cb6ce632dbbc7c4"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi2-devel mumps-ptscotch-openmpi2-devel(aarch-64)"
RDEPENDS:${PN} += "libmumps-ptscotch5_3_5-openmpi2 mumps-devel mumps-scotch-devel openmpi2-devel ptscotch-openmpi2-devel scalapack-openmpi2-devel"

inherit rpm
