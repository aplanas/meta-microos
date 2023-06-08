SUMMARY = "GTK+ 3 version of libdbusmenu"
DESCRIPTION = "This package contains GTK 3 dbusmenu shared library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk3-4-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "9d5d21edd6ba8e660462c822f3f9c95fcb1409af09f76207362d812d4f7c314fe11bc8f4ed90afefe9803ce292ce582a8368e6b2ee22e1444dc18a34155dc78f"

RPROVIDES:${PN} += "libdbusmenu-gtk3-4 libdbusmenu-gtk3-4(aarch-64) libdbusmenu-gtk3.so.4()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbusmenu-glib.so.4()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
