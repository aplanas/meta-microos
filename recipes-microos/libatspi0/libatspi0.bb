SUMMARY = "Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "libatspi0-2.48.3-1.1.aarch64.rpm"
RPM_HASH = "5e040e9b3c2496b68f42fc2b4e51d5993a3ad047d9cade53829dd0ebfc432aac4c76fc0b7248180e6ad99a2a5b8fca70beb909bb4d96ed3bdddf87b93c322325"

RPROVIDES:${PN} += "libatspi.so.0()(64bit) \
libatspi0 \
libatspi0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
