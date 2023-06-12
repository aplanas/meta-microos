SUMMARY = "Thumbnailer for EPub books"
DESCRIPTION = "Thumbnailer for EPub books."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "gnome-epub-thumbnailer-1.7-1.3.aarch64.rpm"
RPM_HASH = "0dd2a00c8556272cd8c09277717a29e79571bfb1ce84049e2f44973d6a9e3fa47eda10418bfb8d52eb05c24efc3b3971e615c27d35b1c95b34034da6c03fb3c0"

RPROVIDES:${PN} += "gnome-epub-thumbnailer \
gnome-epub-thumbnailer(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
