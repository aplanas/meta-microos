SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_arkode5-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "9f8a2e6611c2e07246a922dffe5cc12d5ea6b1b6963cecc27ebbc7f0c511e61deff103a851054b7b27f85ee2436953d708011330b269b1d326031d71aa2c053f"

RPROVIDES:${PN} += "libsundials_arkode.so.5()(64bit) \
libsundials_arkode5-mvapich2 \
libsundials_arkode5-mvapich2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
