SUMMARY = "A tool speed up menus"
DESCRIPTION = "Libmenu-cache is a library creating and utilizing caches to speed up \
the manipulation for freedesktop.org defined application menus. \
It can be used as a replacement of libgnome-menu of gnome-menus."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "menu-cache-1.1.0-2.13.aarch64.rpm"
RPM_HASH = "ee676a619fe339a27819e9ce7001e07f3f9a8822e3ee3daca928221a7e51171bd1192e83a819646ae1f488c6080897f21464dcff4870f5e3c22d9bf92c2398c7"

RPROVIDES:${PN} += "menu-cache menu-cache(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfm-extra.so.4()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
