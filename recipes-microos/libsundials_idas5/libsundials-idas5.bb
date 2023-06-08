SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_idas5-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "8b841448be5a92d80de9a77aaf38098eb395f345e75cabd8a32c7bbe1fa83cb39373312b4b1507e8a2b8d2739c344d67df0c854e9e8022d7d22de65a8e5e6d3f"

RPROVIDES:${PN} += "libsundials_idas.so.5()(64bit) libsundials_idas5 libsundials_idas5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
