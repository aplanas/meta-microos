SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_generic6-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "e6016deea151a28754e18f379946ff39117c99dbe519c54c8fe62e8f17bdeb815b5946fc315632fac1a66ad1f6eae275cd663a9e8e4114f4feee156d243a6ba7"

RPROVIDES:${PN} += "libsundials_generic.so.6()(64bit) \
libsundials_generic6-mvapich2 \
libsundials_generic6-mvapich2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
