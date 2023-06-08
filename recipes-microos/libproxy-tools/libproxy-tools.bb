SUMMARY = "An example application using libproxy"
DESCRIPTION = "An example application that will use libproxy to give the results that can \
be expected from other applications. It can be used to debug what would \
happen in various cases."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy-tools-0.4.18-1.4.aarch64.rpm"
RPM_HASH = "e3da23b1928a033989efa6bde0a15067725a11f357ed78480fa96da7012cb7019bbb3e180d70be271d9f12fd2d8dea01806d0f5df11748bb850e515cb509d9ff"

RPROVIDES:${PN} += "libproxy-tools libproxy-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libproxy.so.1()(64bit) libproxy.so.1(LIBPROXY_0.4.16)(64bit) libproxy1"

inherit rpm
