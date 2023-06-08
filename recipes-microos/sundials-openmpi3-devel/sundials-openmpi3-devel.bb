SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-openmpi3-devel-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "ff0be968fd324e380baec2707957141c551b49d5db9245b77c57d029d497277c72b4405ca53ca6676398a32e8385ea72b6faaa68f75cff6d9d198950f02ceca2"

RPROVIDES:${PN} += "sundials-openmpi3-devel sundials-openmpi3-devel(aarch-64)"
RDEPENDS:${PN} += "libsundials_arkode5-openmpi3 libsundials_cvode6-openmpi3 libsundials_cvodes6-openmpi3 libsundials_generic6-openmpi3 libsundials_ida6-openmpi3 libsundials_idas5-openmpi3 libsundials_kinsol6-openmpi3 libsundials_nvec6-openmpi3 libsundials_sunlinsol4_3_0-openmpi3 libsundials_sunmatrix4-openmpi3 libsundials_sunnonlin3_3_0-openmpi3"

inherit rpm
