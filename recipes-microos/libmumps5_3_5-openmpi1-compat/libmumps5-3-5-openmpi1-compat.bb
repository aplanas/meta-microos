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

RPM_NAME = "libmumps5_3_5-openmpi1-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "b69cf4ee7947b3a0c59a33af5c5999b0349115de709b75e71290294b8c7c14ed3c4a7d2edbc1b934e2006c39b5fe23cf6e629e25d46873fc0ebffce19c443a7b"

RPROVIDES:${PN} += "libmumps5_3_5-openmpi1-compat libmumps5_3_5-openmpi1-compat(aarch-64)"
RDEPENDS:${PN} += "libmumps5_3_5"

inherit rpm
