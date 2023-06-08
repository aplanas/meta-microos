SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.0.1+git7231"

RPM_NAME = "libgphobos4-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "cbb89b5b88493ca276104a7df07c0c049a32fd879118c8aa4f7e687a2a16a7a9471c184660a0681f904a6aef02bc03d466e43f20b3ea454a3dcc32a78aaa53ec"

RPROVIDES:${PN} += "libgphobos.so.4()(64bit) libgphobos4 libgphobos4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
