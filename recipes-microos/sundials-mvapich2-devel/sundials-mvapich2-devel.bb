SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-mvapich2-devel-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "3d953322aa593106731cc7f0170e4e6b3bccdaf088e5cb4de228235916d1b4c9036e3f8bdfd2fae4a4e777ca6a0a65176f4286450b37677e7db648f7f8acbb19"

RPROVIDES:${PN} += "sundials-mvapich2-devel sundials-mvapich2-devel(aarch-64)"
RDEPENDS:${PN} += "libsundials_arkode5-mvapich2 libsundials_cvode6-mvapich2 libsundials_cvodes6-mvapich2 libsundials_generic6-mvapich2 libsundials_ida6-mvapich2 libsundials_idas5-mvapich2 libsundials_kinsol6-mvapich2 libsundials_nvec6-mvapich2 libsundials_sunlinsol4_3_0-mvapich2 libsundials_sunmatrix4-mvapich2 libsundials_sunnonlin3_3_0-mvapich2"

inherit rpm
