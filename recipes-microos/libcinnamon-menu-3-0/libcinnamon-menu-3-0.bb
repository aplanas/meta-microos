SUMMARY = "A menu system for the Cinnamon desktop environment"
DESCRIPTION = "cinnamon-menus is an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org. This package also contains \
the Cinnamon menu layout configuration files, .directory files and \
assorted menu related utility programs, Python bindings, and a \
simple menu editor."
LICENSE = "LGPL-2.1-or-later"

PV = "5.8.0"

RPM_NAME = "libcinnamon-menu-3-0-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "f594f8c0fa0e4257d7bc27320db6c305614d20391d813ba167d2ebc5365b39eb4a670e3fd518709d4e93890e679a60b727fcb33e8c954724a4a60564b8a96653"

RPROVIDES:${PN} += "cinnamon-menus \
libcinnamon-menu-3-0 \
libcinnamon-menu-3-0(aarch-64) \
libcinnamon-menu-3.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
