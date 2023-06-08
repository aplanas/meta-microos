SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-scotch."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-scotch-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "2ace97b1135ebbb9ab25f83c0794f1fce7e6653ea57490e643846a8d50755ab9075550f558ba06243d07c2fde99265cfee1fc4cb636bd99a33c0aa3c19c3a8c9"

RPROVIDES:${PN} += "mumps-scotch-devel mumps-scotch-devel(aarch-64)"
RDEPENDS:${PN} += "blas-devel lapack-devel libmumps-scotch5_3_5 mumps-devel scotch-devel"

inherit rpm
