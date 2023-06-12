SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_nvec6-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "1553f67e6327bcdeca1df4f0f9c72ec10a9e642c5b61e2ffcd2705a94a6e211d85632f69d1192ee8f64956be74cedf697e543eff51d9f05299ed685944fc0c63"

RPROVIDES:${PN} += "libsundials_nvec6-mvapich2 \
libsundials_nvec6-mvapich2(aarch-64) \
libsundials_nvecmanyvector.so.6()(64bit) \
libsundials_nvecmpimanyvector.so.6()(64bit) \
libsundials_nvecmpiplusx.so.6()(64bit) \
libsundials_nvecparallel.so.6()(64bit) \
libsundials_nvecpthreads.so.6()(64bit) \
libsundials_nvecserial.so.6()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi.so.12()(64bit)"

inherit rpm
