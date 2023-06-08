SUMMARY = "Library for real-time communications with async IO support"
DESCRIPTION = "Libre is a library for real-time communications \
with async I/O support and a complete SIP stack with support for protocols \
such as SDP, RTP/RTCP, STUN/TURN/ICE, BFCP, HTTP and DNS Client."
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "libre12-2.10.0-1.4.aarch64.rpm"
RPM_HASH = "4a498493189dd02a04e4ede28ed503097e5bce5b23ed8b134307709039a37ab524c74a7653bbbce54e130b45b66bd884338974a7f4d2d6b48e0c5d75746af761"

RPROVIDES:${PN} += "libre.so.12()(64bit) libre12 libre12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit)"

inherit rpm
