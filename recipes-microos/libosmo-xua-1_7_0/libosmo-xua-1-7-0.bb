SUMMARY = "Osmocom Message Transfer Part 2 User Adaptation library"
DESCRIPTION = "M2UA (RFC 3331) provides an SCTP (RFC 3873) adaptation layer for the \
seamless backhaul of MTP Level 2 user messages and service interface \
across an IP network."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-xua-1_7_0-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "a6edde43bba93ea7797c51955a29145fee2001bbdef3c1e60b41b1720fc325e45df7a7c45d5ef5f2eb56d3df3bbc6636afe98e166c4f668e5e3242e0d26b0183"

RPROVIDES:${PN} += "libosmo-xua-1.7.0.so()(64bit) libosmo-xua-1_7_0 libosmo-xua-1_7_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.20()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
