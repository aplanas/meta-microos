SUMMARY = "Graph Visualization CGI Script for vnstat"
DESCRIPTION = "vnStat is a network traffic monitor for Linux that keeps a log of \
daily network traffic for the selected interface(s). vnStat isn't a \
packet sniffer. The traffic information is analyzed from the /proc \
filesystem, so vnStat can be used without root permissions. \
 \
This package contains a CGI script that visualizes graphs of the \
collected traffic statistics."
LICENSE = "GPL-2.0-only"

PV = "2.10"

RPM_NAME = "vnstat-cgi-2.10-2.2.aarch64.rpm"
RPM_HASH = "b276eec07703caa961a1dfcdec04449a9becb130a0ecc7d56b27785516ae84ce5d04b7c4b2aa0a751b00fac727dda000f61b8dc123705d3801351de7fcaf057c"

RPROVIDES:${PN} += "config(vnstat-cgi) vnstat-cgi vnstat-cgi(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgd.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsqlite3.so.0()(64bit) vnstat"

inherit rpm
