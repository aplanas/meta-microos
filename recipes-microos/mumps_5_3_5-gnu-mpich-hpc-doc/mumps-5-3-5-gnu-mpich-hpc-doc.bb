SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides Documentation for mumps_5_3_5-gnu-mpich-hpc. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-mpich-hpc-doc-5.3.5-3.3.noarch.rpm"
RPM_HASH = "ebc27f6a1c59f5a28098433fed9dbc6b6a963a0a9a77d0a2afc58c43f4710265a8be3c8ebbad6de7e9d62b61f55759482afc662ac9ca559802ef6ce3c791d637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-mpich-hpc-doc"
RDEPENDS:${PN} += ""

inherit rpm
