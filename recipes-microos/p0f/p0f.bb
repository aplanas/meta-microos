SUMMARY = "A versatile passive OS fingerprinting tool"
DESCRIPTION = "P0f is a tool that utilizes an array of sophisticated, purely passive traffic \
fingerprinting mechanisms to identify the players behind any incidental TCP/IP \
communications (often as little as a single normal SYN) without interfering in \
any way."
LICENSE = "LGPL-2.1"

PV = "3.09b"

RPM_NAME = "p0f-3.09b-1.25.aarch64.rpm"
RPM_HASH = "3c96196fa4bea3a91c29f68ca94aadecd7e2ec0524507256a6518e1d718ab3e5a370b9c2c3ac34daa25d868544e0ce391f4c260c97bdeb56deb7d054103fae9d"

RPROVIDES:${PN} += "config(p0f) \
p0f \
p0f(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcap.so.1()(64bit)"

inherit rpm
