SUMMARY = "Multi-precision floating-point interval arithmetic computation library"
DESCRIPTION = "The CM software implements the construction of ring class fields of \
imaginary quadratic number fields and of elliptic curves with complex \
multiplication via floating point approximations. \
 \
It includes libraries that can be called from within a C program."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0+gb2b8d4bd"

RPM_NAME = "libcm0-0.4.0+gb2b8d4bd-1.4.aarch64.rpm"
RPM_HASH = "24819211b68a27d4af9787d8f06d528047a281842a3739d91d2afad134da3fea16f9052bcd5f2c04d06cf8f9e57121984cb5e4c6ae8b6e33020b0d18b0c38c7a"

RPROVIDES:${PN} += "libcm.so.0()(64bit) libcm0 libcm0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libmpfrcx.so.1()(64bit) libpari-gmp-tls.so.8()(64bit) libz.so.1()(64bit)"

inherit rpm
