SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for openmpi3."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-openmpi3-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "89cb5d0bc615bbd9eef8a9e245acdb9bd4a44fd56d54fd95f85fac81cc087732e4270b5352c216c43c9646ed2f77add87fda0781b25d491b669eb2dcf54a87fd"

RPROVIDES:${PN} += "libmumps5_3_5-openmpi3-compat libmumps5_3_5-openmpi3-compat(aarch-64)"
RDEPENDS:${PN} += "libmumps5_3_5"

inherit rpm
