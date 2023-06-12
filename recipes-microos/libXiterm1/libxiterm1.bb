SUMMARY = "Terminal emulator Xaw widget library based on libiterm"
DESCRIPTION = "Terminal emulator Xaw widget library based on libiterm"
LICENSE = "SUSE-CPL-0.5"

PV = "0.5.20040304"

RPM_NAME = "libXiterm1-0.5.20040304-301.9.aarch64.rpm"
RPM_HASH = "35920653a08d2927310a321869f44a8a1b7cba4f772f15bc3397785ddcb81c38fa25f709a5bc70ca06a7fe3a85646a8095786fd6b876ede83e2032b65a370de7"

RPROVIDES:${PN} += "libXiterm \
libXiterm.so.1()(64bit) \
libXiterm1 \
libXiterm1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
