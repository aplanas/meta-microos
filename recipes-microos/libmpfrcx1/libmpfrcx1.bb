SUMMARY = "Multi-precision floating-point interval arithmetic computation library"
DESCRIPTION = "MPFRCX is a library for the arithmetic of univariate polynomials over \
arbitrary precision real or complex numbers, without control on the \
rounding. \
 \
The motivation for the library is to have functionality available for \
the floating-point approach to complex multiplication. \
Asymptotically-fast routines such as Toom–Cook and the FFT for \
multiplication of polynomials are available, as well as fast routines \
for interpolation and evaluation based on trees of polynomials."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "libmpfrcx1-0.6.3-1.6.aarch64.rpm"
RPM_HASH = "7ff3df6dddb02259e9756e926c083a2ee53700b5d12b6bdba2b1f36cab9db619ac1e066881276121b3bda029e2545c814da11dc1c6eb9dfec2ed4460bf919792"

RPROVIDES:${PN} += "libmpfrcx.so.1()(64bit) libmpfrcx1 libmpfrcx1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit)"

inherit rpm
