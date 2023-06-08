SUMMARY = "Osmocom core library"
DESCRIPTION = "libosmocore is a library with various utility functions shared \
between OpenBSC and OsmocomBB."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmocore19-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "c3d474c201e2f86a1c21f4401b7fa5564ffac13ab547f44f0e9bea567dc49ec245574420572becb8a2e79aa32b9c01785c9426dcf1c5d8eb3827b6c4a90f975e"

RPROVIDES:${PN} += "libosmocore.so.19()(64bit) libosmocore19 libosmocore19(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libmnl.so.0()(64bit) libmnl.so.0(LIBMNL_1.0)(64bit) libsctp.so.1()(64bit) libsctp.so.1(VERS_1)(64bit) libsctp.so.1(VERS_3)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libtalloc.so.2(TALLOC_2.1.0)(64bit)"

inherit rpm
