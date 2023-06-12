SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps_5_3_5-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi4-hpc-devel-static-5.3.5-3.2.aarch64.rpm"
RPM_HASH = "ac7b4a9647e91aa6f00956f726a750b30326416dbbdd82785b826608ac9f10bb5ea686395a65ca202b996055fa86db4dd2e3f5eb9bce271da7a02a37ad9b6722"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-openmpi4-hpc-devel-static \
mumps_5_3_5-gnu-openmpi4-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "mumps_5_3_5-gnu-openmpi4-hpc-devel"

inherit rpm
