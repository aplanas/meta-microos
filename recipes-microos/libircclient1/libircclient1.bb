SUMMARY = "Library implementing client-server IRC protocol"
DESCRIPTION = "It is designed to be small, fast, portable and compatible to RFC standards and most IRC clients."
LICENSE = "LGPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "libircclient1-1.10-1.14.aarch64.rpm"
RPM_HASH = "331d88090d9a1571421c5fd9dd5930e0707a0299483ea5203cbd0b624dc668ab04eaa67e1e6c0195413906955339662677fd1265c19278062b22d638a1b3d629"

RPROVIDES:${PN} += "libircclient.so.1()(64bit) \
libircclient1 \
libircclient1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
