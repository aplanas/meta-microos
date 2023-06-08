SUMMARY = "Header files for libslab"
DESCRIPTION = "This library makes it easy to create tile-based UI for MATE, as seen in \
gnome-main-menu. \
 \
This package provides libslab development files."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "libmate-slab-devel-1.26.0-1.10.aarch64.rpm"
RPM_HASH = "c445d1e86dd08870ae55df78bdf7432fbcd60f20161f259c3847ef608e61d13173316821867a38751e4d59f73caacf0cca21cbe9bc4b956b28a8c5cb08dc098a"

RPROVIDES:${PN} += "libmate-slab-devel libmate-slab-devel(aarch-64) pkgconfig(mate-slab)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmate-slab0 pkgconfig(gdk-3.0) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk+-3.0) pkgconfig(libmate-menu) pkgconfig(librsvg-2.0) pkgconfig(mate-desktop-2.0)"

inherit rpm
