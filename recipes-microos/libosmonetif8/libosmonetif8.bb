SUMMARY = "Osmocom library for muxed audio"
DESCRIPTION = "Network interface demuxer library for OsmoCom projects."
LICENSE = "AGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "libosmonetif8-1.2.0-1.5.aarch64.rpm"
RPM_HASH = "215849718945fb8902eb26809f21c37300ef55c7cfa5ed64d910be47a1ab51a1702f1753610d3b2fcec9eb6208544800e685776c38d7a011e206e207600d68df"

RPROVIDES:${PN} += "libosmonetif.so.8()(64bit) libosmonetif8 libosmonetif8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libsctp.so.1()(64bit) libsctp.so.1(VERS_1)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
