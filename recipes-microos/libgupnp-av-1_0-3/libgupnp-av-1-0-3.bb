SUMMARY = "Library to ease the handling and implementation of UPnP A/V profiles"
DESCRIPTION = "GUPnP A/V is a small utility library that aims to ease the handling and \
implementation of UPnP A/V profiles."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "libgupnp-av-1_0-3-0.14.1-2.1.aarch64.rpm"
RPM_HASH = "be0f18f4c164d91b09605f316c9e2ffc384f20de4b4a33a56450cbd21d01f31fe8fe475c0a03035a54e336566a780b0a8e58d2ab49838bcb1e6c5e564427e8e3"

RPROVIDES:${PN} += "libgupnp-av-1.0.so.3()(64bit) libgupnp-av-1_0-3 libgupnp-av-1_0-3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gupnp-av ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.8)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
