SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_idas5-openmpi4-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "cadbb28d189ab1a2176177588898103b6c311880d73fa331d5ca0a30a168befc1f0bc66517d9642a11964cb98993c9e96c888ab29a041014b5d65b690dd125db"

RPROVIDES:${PN} += "libsundials_idas.so.5()(64bit) libsundials_idas5-openmpi4 libsundials_idas5-openmpi4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
