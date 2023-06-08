SUMMARY = "File Manager for the GNOME Desktop -- Extension Library"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package contains the library used by nautilus extensions."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "libnautilus-extension4-44.1-1.1.aarch64.rpm"
RPM_HASH = "a18226c4fb9cb9380840a1daf8bff8fe24f0c5b8d5db076d7df6d39beb4c55a750738ecdb96a58154710c3c5b7b73310652252be9134dc4fac6d9ea0db7cef36"

RPROVIDES:${PN} += "libnautilus-extension.so.4()(64bit) libnautilus-extension4 libnautilus-extension4(aarch-64) libnautilus-image-properties.so()(64bit) libtotem-properties-page.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgexiv2.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
