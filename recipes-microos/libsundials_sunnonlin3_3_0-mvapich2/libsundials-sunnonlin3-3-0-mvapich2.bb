SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunnonlin3_3_0-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "620228c30722adfbd6944480b4d15cbde9279a74f942da4bab3f2615ce7a52a63c37909764777fed2b9daf4dea011ca01f9832f2c898e689c0d59c4ddc0c3eea"

RPROVIDES:${PN} += "libsundials_sunnonlin3_3_0-mvapich2 \
libsundials_sunnonlin3_3_0-mvapich2(aarch-64) \
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
