SUMMARY = "MATE Desktop Menu"
DESCRIPTION = "The libmate-menu library implements the 'Desktop Menu Specification' \
from freedesktop.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "libmate-menu2-1.26.0-1.8.aarch64.rpm"
RPM_HASH = "f435382837a5b6b84b6c9efbd59d30ee0f6ac2a8256afc42c76c3c77c4e7706e5e43c455c42fd5220a01b55428c0d0c6012fc93a1829c76bb236b4ea4a48282d"

RPROVIDES:${PN} += "libmate-menu.so.2()(64bit) libmate-menu2 libmate-menu2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
