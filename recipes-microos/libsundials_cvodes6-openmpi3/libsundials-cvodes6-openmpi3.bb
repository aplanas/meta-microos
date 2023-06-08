SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvodes6-openmpi3-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "9c04b6c7cf5b3de3529d544817370af5c499e152856397fda990c3ac2e3eadc0933fc182747f6a2fe495d845698f2417824e4e8cf576c3c22ec83d365ce6824c"

RPROVIDES:${PN} += "libsundials_cvodes.so.6()(64bit) libsundials_cvodes6-openmpi3 libsundials_cvodes6-openmpi3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
