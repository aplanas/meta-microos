SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunnonlin3_3_0-openmpi2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "49a15bb92011fa5145549d202f7318fab2aca92569109fba85ebe3871ed925141f25fb784cddacaedc48aa126803b8c1af2b9689a8bb292827588af54c6b2f7c"

RPROVIDES:${PN} += "libsundials_sunnonlin3_3_0-openmpi2 libsundials_sunnonlin3_3_0-openmpi2(aarch-64) libsundials_sunnonlinsolfixedpoint.so.3.3.0()(64bit) libsundials_sunnonlinsolnewton.so.3.3.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
