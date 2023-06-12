SUMMARY = "Menu-cache libraries"
DESCRIPTION = "menu-cache libraries for development"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libmenu-cache3-1.1.0-2.13.aarch64.rpm"
RPM_HASH = "dbcd034da13d2b6ae46875a7b490914ab094237f63cc61161339234f75d24012979ef20e816fa692f6edde2a7fdf4ce48b07b04a7f4365bf87aaba7ce288c395"

RPROVIDES:${PN} += "libmenu-cache.so.3()(64bit) \
libmenu-cache3 \
libmenu-cache3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
