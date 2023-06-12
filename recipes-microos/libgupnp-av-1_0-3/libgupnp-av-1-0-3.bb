SUMMARY = "Library to ease the handling and implementation of UPnP A/V profiles"
DESCRIPTION = "GUPnP A/V is a small utility library that aims to ease the handling and \
implementation of UPnP A/V profiles."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "libgupnp-av-1_0-3-0.14.1-3.1.aarch64.rpm"
RPM_HASH = "c59c11002ceee2177f96fc8d992e8db901ca253486533c61a0024c13107eb8b588623775c05c2fc2dd837b8db080fb931f244fcecdb0213a8b1e9af1bbdd3f72"

RPROVIDES:${PN} += "libgupnp-av-1.0.so.3()(64bit) libgupnp-av-1_0-3 libgupnp-av-1_0-3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gupnp-av ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.8)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
