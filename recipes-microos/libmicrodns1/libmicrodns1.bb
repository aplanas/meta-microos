SUMMARY = "Shared library files for libmicrodns"
DESCRIPTION = "Minimal mDNS resolver (and announcer) library. \
The libmicrodns1 package contains shared libraries files for libmicrodns."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0+6"

RPM_NAME = "libmicrodns1-0.2.0+6-2.2.aarch64.rpm"
RPM_HASH = "d91b90d8358d07df79ee5ee344de56d8c5575691f5e2d2f68a01bcdbad206e5435ba02e86e9f7ccdd3f957cdddc9a90d3c5bb2fb8acc2419e6e689fa2c3158a9"

RPROVIDES:${PN} += "libmicrodns.so.1()(64bit) libmicrodns1 libmicrodns1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
