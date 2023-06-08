SUMMARY = "A Cairo-based canvas widget for GTK+"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. It has an optional model/view split, and uses interfaces \
for items and models, so any application object can be turned into a \
canvas item or model."
LICENSE = "LGPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "libgoocanvas-2_0-9-2.0.4-2.9.aarch64.rpm"
RPM_HASH = "34129ec17698bdaa3075772ac70117de24232cd5bc5439115e11bb04fd3624fb67daf75acfd092f719040742cb48c687f2ee006b8c117bf2a1d40d7f2a063974"

RPROVIDES:${PN} += "goocanvas2 libgoocanvas-2.0.so.9()(64bit) libgoocanvas-2_0-9 libgoocanvas-2_0-9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit)"

inherit rpm
