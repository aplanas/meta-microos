SUMMARY = "ThinIce GTK+ 2 Theme Engine"
DESCRIPTION = "The ThinIce engine features thin edges and Icy Colors, and provides a \
simple mostly clean appearance many find satisfying."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-thinice-2.20.2-19.42.aarch64.rpm"
RPM_HASH = "6e8589b85243757ae8c8a279202be8c0d8c21a01b633ab5c899ba4c9aac6bceaaf00085cccd07ddf233f8324875327e43438070d9cb1dd3b38e56e7c8b2f56a2"

RPROVIDES:${PN} += "gtk2-engine-thinice \
gtk2-engine-thinice(aarch-64) \
libthinice.so()(64bit)"
RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
