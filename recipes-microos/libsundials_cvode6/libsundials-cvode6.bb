SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvode6-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "45f86e41d42241edb984eaf3f0674d60b507f036afccad8f37fce368c9feee5e154381df60f011b382dd1e584260878b8c236e63cd7a23fbc9583242571185af"

RPROVIDES:${PN} += "libsundials_cvode.so.6()(64bit) libsundials_cvode6 libsundials_cvode6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
