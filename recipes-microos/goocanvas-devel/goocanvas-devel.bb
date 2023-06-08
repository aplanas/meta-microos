SUMMARY = "Development files for GooCanvas"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libgoocanvas."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "goocanvas-devel-3.0.0-2.9.aarch64.rpm"
RPM_HASH = "e88ecf3627f31157e7aeb11520a773c58052f1d1178643f3cc45de7f18fb1eb2761ce84011f390907bd383c04c6d2789901cc16c84b04b2f0d429893de0b9fe3"

RPROVIDES:${PN} += "goocanvas-devel goocanvas-devel(aarch-64) pkgconfig(goocanvas-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgoocanvas-3_0-9 pkgconfig(cairo) pkgconfig(gtk+-3.0) typelib-1_0-GooCanvas-3_0"

inherit rpm
