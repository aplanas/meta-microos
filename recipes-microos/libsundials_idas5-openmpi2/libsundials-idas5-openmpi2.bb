SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_idas5-openmpi2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "fc577bb90105da6e31387c95f13b76fa86c34cc79625fe1e378e081508f724e5f8debe2c5e6c1b84a31fd988ff2e5b3ad0d5c92923f623ecf552daf08f1ffdb9"

RPROVIDES:${PN} += "libsundials_idas.so.5()(64bit) \
libsundials_idas5-openmpi2 \
libsundials_idas5-openmpi2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
