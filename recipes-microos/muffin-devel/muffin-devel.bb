SUMMARY = "Muffin development files"
DESCRIPTION = "Cinnamon Desktop default window manager. \
Muffin uses GTK+ and Clutter to do everything. \
 \
This package provides the development files."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.2.0"

RPM_NAME = "muffin-devel-5.2.0-1.9.aarch64.rpm"
RPM_HASH = "364dcac1ef87d02f35ac6327ea6151cce5fd5cdf2218aa1d3c7063bbc4bab148e06e31c21c8e66c731f5a044e9e09cbc0afb8ea287cc7116a45520aec330db58"

RPROVIDES:${PN} += "muffin-devel muffin-devel(aarch-64) pkgconfig(libmuffin) pkgconfig(muffin-clutter-0) pkgconfig(muffin-clutter-x11-0) pkgconfig(muffin-cogl-0) pkgconfig(muffin-cogl-pango-0) pkgconfig(muffin-cogl-path-0) pkgconfig(muffin-plugins)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libmuffin.so.0()(64bit) libmuffin0 libpango-1.0.so.0()(64bit) pkgconfig(atk) pkgconfig(cairo) pkgconfig(cairo-gobject) pkgconfig(cinnamon-desktop) pkgconfig(egl) pkgconfig(gdk-pixbuf-2.0) pkgconfig(gio-2.0) pkgconfig(gmodule-no-export-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk+-3.0) pkgconfig(json-glib-1.0) pkgconfig(muffin-clutter-0) pkgconfig(muffin-cogl-0) pkgconfig(pangocairo) pkgconfig(pangoft2) pkgconfig(x11) pkgconfig(xcomposite) pkgconfig(xdamage) pkgconfig(xext) pkgconfig(xfixes) pkgconfig(xi) pkgconfig(xrandr) pkgconfig(xtst) typelib-1_0-Muffin-0_0"

inherit rpm
