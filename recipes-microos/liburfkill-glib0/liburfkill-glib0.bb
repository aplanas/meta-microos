SUMMARY = "The glib binding library for urfkill"
DESCRIPTION = "Urfkill add-on library to integrate the standard urfkill library with \
the GLib thread abstraction and main loop."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "liburfkill-glib0-0.5.0-3.6.aarch64.rpm"
RPM_HASH = "7d7bf22109bc19d56c7da55eb1778d68f41ca7d52bde057326dc97a05aafcec4c7bb88a7d50b582c6cec9525cf4b1a7b5aa26b552c3051e15fd7bbd77c9fbf1d"

RPROVIDES:${PN} += "liburfkill-glib.so.0()(64bit) liburfkill-glib0 liburfkill-glib0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
