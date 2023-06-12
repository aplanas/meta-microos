SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for openmpi2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi2-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "14cc8775bd8ba0e8325f8dd2a673c83ffa02dce4aba588cbee6b2174525e0f3d67c0150e06f1e2a9ce58aff6dfc7cbcf072e8954998846705dcd6ad0c5fe260d"

RPROVIDES:${PN} += "libmumps-ptscotch5_3_5-openmpi2-compat \
libmumps-ptscotch5_3_5-openmpi2-compat(aarch-64)"
RDEPENDS:${PN} += "libmumps-scotch5_3_5"

inherit rpm
