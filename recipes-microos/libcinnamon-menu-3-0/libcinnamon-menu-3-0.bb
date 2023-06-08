SUMMARY = "A menu system for the Cinnamon desktop environment"
DESCRIPTION = "cinnamon-menus is an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org. This package also contains \
the Cinnamon menu layout configuration files, .directory files and \
assorted menu related utility programs, Python bindings, and a \
simple menu editor."
LICENSE = "LGPL-2.1-or-later"

PV = "5.6.0"

RPM_NAME = "libcinnamon-menu-3-0-5.6.0-1.3.aarch64.rpm"
RPM_HASH = "8fe67b788981e854a9a0a7ffefaeb5a163b349ce58e72b8ade5427a2ff4a032b947c10d98d2db4fd6315c388ffac5a9cf9c5be4dd889f0098a6534b9bdccec70"

RPROVIDES:${PN} += "cinnamon-menus libcinnamon-menu-3-0 libcinnamon-menu-3-0(aarch-64) libcinnamon-menu-3.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
