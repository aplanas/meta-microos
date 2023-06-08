SUMMARY = "Library to dusplay maps - Development Files"
DESCRIPTION = "Libchamplain is a C library providing a ClutterActor to display maps. It \
also provides a Gtk+ widget to display maps in Gtk+ applications. \
 \
It supports numerous free map sources such as OpenStreetMap, \
OpenAerialMap and Maps for free."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.21"

RPM_NAME = "libchamplain-devel-0.12.21-1.3.aarch64.rpm"
RPM_HASH = "d658c3b932284dc8bf2fea2b688d7de87aa7e57a77e7d4f88968f4b286b1aa39ed281dd8e317b7fd54895b16271be53565aed9a7a4d5146c67ddf236e04e29b0"

RPROVIDES:${PN} += "libchamplain-devel libchamplain-devel(aarch-64) pkgconfig(champlain-0.12) pkgconfig(champlain-gtk-0.12)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libchamplain-0_12-0 pkgconfig(cairo) pkgconfig(champlain-0.12) pkgconfig(clutter-1.0) pkgconfig(clutter-gtk-1.0) pkgconfig(gdk-3.0) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk+-3.0) pkgconfig(libsoup-3.0) pkgconfig(sqlite3) typelib-1_0-Champlain-0_12"

inherit rpm
