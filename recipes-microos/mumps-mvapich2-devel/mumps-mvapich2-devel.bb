SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-mvapich2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-mvapich2-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "df73eea1e5b6acd97c5002a8e5d07403519bd68517424462efc1eaccd5ee28fb83f27e37f632d59724c0e7f5cedfb846269ce67ef03bd1b190185cbc62022416"

RPROVIDES:${PN} += "mumps-mvapich2-devel mumps-mvapich2-devel(aarch-64)"
RDEPENDS:${PN} += "libmumps5_3_5-mvapich2 mumps-devel mvapich2-devel scalapack-mvapich2-devel"

inherit rpm
