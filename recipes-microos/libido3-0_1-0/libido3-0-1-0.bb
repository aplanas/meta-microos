SUMMARY = "Shared library providing extra GTK+ menu items in system indicators"
DESCRIPTION = "Shared library providing extra GTK+ menu items for display in \
system indicators. \
 \
This package contains shared libraries."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "13.10.0+bzr20161028"

RPM_NAME = "libido3-0_1-0-13.10.0+bzr20161028-3.16.aarch64.rpm"
RPM_HASH = "e812bc9f5d81c244df61356d4b16cadd3bd95ae6a91a1d20782ad5c0a933d1234587da803d23b095d43b416454319c2f6d8397b44b6647fbef47158bf3d2ccf0"

RPROVIDES:${PN} += "libido3-0.1.so.0()(64bit) libido3-0_1-0 libido3-0_1-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit)"

inherit rpm
