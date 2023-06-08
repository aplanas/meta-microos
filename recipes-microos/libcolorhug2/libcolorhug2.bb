SUMMARY = "Library for managing color devices"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "libcolorhug2-1.4.6-2.3.aarch64.rpm"
RPM_HASH = "9cb51c7233a8bcb7ac3354b3e8401cc44abfa1ecb0dccc6b3fda64a8779dc971aed53bc45a2f5cd956a5f8e766e28e077d130938a52e0c323b2f9328f9be68b6"

RPROVIDES:${PN} += "libcolorhug.so.2()(64bit) libcolorhug2 libcolorhug2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcolordprivate.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgusb.so.2()(64bit) libgusb.so.2(LIBGUSB_0.1.0)(64bit) libgusb.so.2(LIBGUSB_0.1.1)(64bit)"

inherit rpm
