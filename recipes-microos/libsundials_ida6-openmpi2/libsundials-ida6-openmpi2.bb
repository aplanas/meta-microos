SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_ida6-openmpi2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "60ef0c81b1453a07813babb48319f0314f60ad9bb370e214108b05209f5e0f20bbc7494d4bb2b9666b4c94333be71749994d154567af3698dfafca5afd98869e"

RPROVIDES:${PN} += "libsundials_ida.so.6()(64bit) libsundials_ida6-openmpi2 libsundials_ida6-openmpi2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
