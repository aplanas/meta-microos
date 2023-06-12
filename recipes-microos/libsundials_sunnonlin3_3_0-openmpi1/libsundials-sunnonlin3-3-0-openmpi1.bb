SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunnonlin3_3_0-openmpi1-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "35e31496134fd15f48698ccbbc44662d88ac1363d8f38a604014d855afae32c9d15087287220079a5843225c64f4cdc0b7a0cdd9d88dcc632220c29bf9e40735"

RPROVIDES:${PN} += "libsundials_sunnonlin3_3_0-openmpi1 \
libsundials_sunnonlin3_3_0-openmpi1(aarch-64) \
libsundials_sunnonlinsolfixedpoint.so.3.3.0()(64bit) \
libsundials_sunnonlinsolnewton.so.3.3.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
