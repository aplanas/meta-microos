SUMMARY = "TCP/IP swiss army knife"
DESCRIPTION = "A simple Unix utility which reads and writes data across network \
connections using TCP or UDP protocol. It is designed to be a reliable \
'back-end' tool that can be used directly or easily driven by other \
programs and scripts. At the same time it is a feature-rich network \
debugging and exploration tool, since it can create almost any kind of \
connection you would need and has several interesting built-in \
capabilities. \
 \
This package contains the OpenBSD rewrite of netcat, including support \
for IPv6, proxies, and Unix sockets."
LICENSE = "BSD-3-Clause"

PV = "1.203"

RPM_NAME = "netcat-openbsd-1.203-4.7.aarch64.rpm"
RPM_HASH = "1a880302ec6d9a309f9c5830fc05a001ec1d7af44a9c390faf4184f76ff4e37417eb7014a85654093417d8bdbbe286387163e524e035010fc2e92bfc7f55d707"

RPROVIDES:${PN} += "nc6 netcat netcat-openbsd netcat-openbsd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbsd.so.0()(64bit) libbsd.so.0(LIBBSD_0.0)(64bit) libbsd.so.0(LIBBSD_0.2)(64bit) libc.so.6(GLIBC_2.36)(64bit) libresolv.so.2()(64bit) libresolv.so.2(GLIBC_2.17)(64bit)"

inherit rpm
