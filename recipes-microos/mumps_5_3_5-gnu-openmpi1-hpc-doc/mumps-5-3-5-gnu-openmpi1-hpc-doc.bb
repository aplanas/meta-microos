SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides Documentation for mumps_5_3_5-gnu-openmpi1-hpc. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi1-hpc-doc-5.3.5-3.3.noarch.rpm"
RPM_HASH = "8630f382dd07682b8d9b31cd00d5fd4b9bbb34a1277d4f1ad1aba052e0ddcb62cabb454a658ca79dd164a96cd8f9997295fb2970f764a3887dcc4659bea9f324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-openmpi1-hpc-doc"
RDEPENDS:${PN} += ""

inherit rpm
