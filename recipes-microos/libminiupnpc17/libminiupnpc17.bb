SUMMARY = "Universal Plug'n'Play (UPnP) Client Library"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "libminiupnpc17-2.2.4-1.4.aarch64.rpm"
RPM_HASH = "dfa076f1c0cf4b68ca6c4cc5f224de9a9474eda66d9abcf838c73c73763d6e60b3e0991bfd5e2dafb1fe4dce9bc116ca5d5408ab36f2aa16f892dc1458525ec1"

RPROVIDES:${PN} += "libminiupnpc.so.17()(64bit) \
libminiupnpc17 \
libminiupnpc17(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
