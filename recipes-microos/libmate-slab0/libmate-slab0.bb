SUMMARY = "MATE Desktop libslab port"
DESCRIPTION = "This library makes it easy to create tile-based UI for MATE, as seen in \
gnome-main-menu."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "libmate-slab0-1.26.0-1.10.aarch64.rpm"
RPM_HASH = "46e7e99c8dc8b8f7eb3bc8373f41b121b33fe505188d2aa06b5f751d435431c762f2e2a67c23b6cf657d9f5ad3c7f86fb0b967cdef0f7101b990b50f60438ff2"

RPROVIDES:${PN} += "libmate-slab.so.0()(64bit) libmate-slab0 libmate-slab0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libmate-desktop-2.so.17()(64bit) libmate-menu.so.2()(64bit)"

inherit rpm
