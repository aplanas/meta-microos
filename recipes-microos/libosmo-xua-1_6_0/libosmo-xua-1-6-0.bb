SUMMARY = "Osmocom Message Transfer Part 2 User Adaptation library"
DESCRIPTION = "M2UA (RFC 3331) provides an SCTP (RFC 3873) adaptation layer for the \
seamless backhaul of MTP Level 2 user messages and service interface \
across an IP network."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "libosmo-xua-1_6_0-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "7bcae0359626383b597980e18843681fcdd350264be9ff59939ee8b4af6c77551e8348a280a5db7e5e75702d9f1cbbef803e57a4f5ca0a45d5f53b255619931e"

RPROVIDES:${PN} += "libosmo-xua-1.6.0.so()(64bit) libosmo-xua-1_6_0 libosmo-xua-1_6_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
