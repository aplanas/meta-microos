SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvodes6-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "e3ad59aaa670216cbc9220f1e9ceb2f7b862c5c621f7078fcb945a76a903235f1af1ecb17bfb33b78d0ca285bcf47f4d838aaf0ead08cbc70a265a88e69ca1a3"

RPROVIDES:${PN} += "libsundials_cvodes.so.6()(64bit) \
libsundials_cvodes6-mvapich2 \
libsundials_cvodes6-mvapich2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
