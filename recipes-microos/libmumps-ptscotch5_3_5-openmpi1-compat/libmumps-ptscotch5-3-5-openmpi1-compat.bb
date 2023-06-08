SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for openmpi1."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi1-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "c89f7b06df5985866dacf1e51e4d943453c00f3e0d426eb8b2b60b6e4062e9540e420a31aeb50ac8b6d2e8238ac4e95f77331308bd792096cbdf2337f18ad666"

RPROVIDES:${PN} += "libmumps-ptscotch5_3_5-openmpi1-compat libmumps-ptscotch5_3_5-openmpi1-compat(aarch-64)"
RDEPENDS:${PN} += "libmumps-scotch5_3_5"

inherit rpm
