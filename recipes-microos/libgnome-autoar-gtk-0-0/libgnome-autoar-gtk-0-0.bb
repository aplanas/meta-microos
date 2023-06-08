SUMMARY = "Automatic archives creating and extracting library"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.4"

RPM_NAME = "libgnome-autoar-gtk-0-0-0.4.4-1.1.aarch64.rpm"
RPM_HASH = "f36122c6b74430ac6af104902af32e3b3e858aea6952131212f12abacab9420037acdbc842bfcbe51880bb3333c94c151183509dea3405d3f0b649ed01e17739"

RPROVIDES:${PN} += "libgnome-autoar-gtk-0-0 libgnome-autoar-gtk-0-0(aarch-64) libgnome-autoar-gtk-0.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgnome-autoar-0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
