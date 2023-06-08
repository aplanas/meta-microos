SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_generic6-openmpi2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "8154b1b409241ffa87e35f6e4241c691ee7b6eed106be01152fa044ae68c410ca31cbbab3bd5ef8a672f965f244e017aa24d57d19a09c93aabe255099a99956f"

RPROVIDES:${PN} += "libsundials_generic.so.6()(64bit) libsundials_generic6-openmpi2 libsundials_generic6-openmpi2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
