SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps_5_3_5-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-mvapich2-hpc-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "1328ec3edecd10f6a382d71ec47183361dd01493000b70aa3f6ad4931150754eaff7512911f84a45ce42e7b6fc2c5c2720c24c47f5e15982c81b9d3edfb12beb"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-mvapich2-hpc-devel-static mumps_5_3_5-gnu-mvapich2-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "mumps_5_3_5-gnu-mvapich2-hpc-devel"

inherit rpm
