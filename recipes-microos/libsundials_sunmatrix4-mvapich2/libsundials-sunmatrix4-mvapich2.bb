SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunmatrix4-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "a00a45305f2913a29183eb640d3e8920893d8ed27cfcc66ee2fe61b87f291212fda8e660dc7fd0a2df2b3575dee64cb56ad84c1d90536bf3edb03d08e5d7cd44"

RPROVIDES:${PN} += "libsundials_sunmatrix4-mvapich2 libsundials_sunmatrix4-mvapich2(aarch-64) libsundials_sunmatrixband.so.4()(64bit) libsundials_sunmatrixdense.so.4()(64bit) libsundials_sunmatrixsparse.so.4()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
