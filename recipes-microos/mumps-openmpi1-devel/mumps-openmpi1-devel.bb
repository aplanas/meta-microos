SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-openmpi1."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi1-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "32a5c96e6ff535e916bd768977ad76a49be637fb6ef1f0f6bd1c432e12cacd8b2a1bd4beaf8f2f643cb750b0094df930ce561502a75aefad0f7555093de9ab6f"

RPROVIDES:${PN} += "mumps-openmpi1-devel mumps-openmpi1-devel(aarch-64)"
RDEPENDS:${PN} += "libmumps5_3_5-openmpi1 mumps-devel openmpi1-devel scalapack-openmpi1-devel"

inherit rpm
