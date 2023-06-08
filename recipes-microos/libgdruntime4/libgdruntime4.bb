SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.0.1+git7231"

RPM_NAME = "libgdruntime4-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "968ecb62f1a20094ced70d8ec7cba1ae1e43d4bc99b742e5bca91bff4561b68c7d91dc8463683454cd469bb4ad6dd3114ea72c7b1412c07ada43ed083d9d1a5d"

RPROVIDES:${PN} += "libgdruntime.so.4()(64bit) libgdruntime4 libgdruntime4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
