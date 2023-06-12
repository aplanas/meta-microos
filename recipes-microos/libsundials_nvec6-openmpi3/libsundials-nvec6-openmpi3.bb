SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_nvec6-openmpi3-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "f8ccdf186c071847d65f9068423278378647306050f254b592d32dc70c22175431445eae44cc576ee8ab0ceb07c271d3eeb6120fcd06eb34838a8e86ca1c93aa"

RPROVIDES:${PN} += "libsundials_nvec6-openmpi3 \
libsundials_nvec6-openmpi3(aarch-64) \
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
libmpi.so.40()(64bit)"

inherit rpm
