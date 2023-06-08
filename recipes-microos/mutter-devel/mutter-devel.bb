SUMMARY = "Development files for mutter, a window and compositing manager"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the mutter library."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "mutter-devel-44.1-1.1.aarch64.rpm"
RPM_HASH = "ecca64e2f1a19bbfdaf089a00887e53fdd7b7c1b71cec03e5b291e391d848c902c229bb9084cd1b4b3920a18a2d3bad878abee0e07267649098c8d7c06ad867b"

RPROVIDES:${PN} += "mutter-devel mutter-devel(aarch-64) pkgconfig(libmutter-12) pkgconfig(mutter-clutter-12) pkgconfig(mutter-cogl-12) pkgconfig(mutter-cogl-pango-12)"
RDEPENDS:${PN} += "/usr/bin/pkg-config mutter pkgconfig(atk) pkgconfig(cairo) pkgconfig(cairo-gobject) pkgconfig(egl) pkgconfig(gio-unix-2.0) pkgconfig(gl) pkgconfig(glesv2) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(graphene-gobject-1.0) pkgconfig(gsettings-desktop-schemas) pkgconfig(harfbuzz) pkgconfig(json-glib-1.0) pkgconfig(mutter-clutter-12) pkgconfig(mutter-cogl-12) pkgconfig(pango) pkgconfig(pangocairo) pkgconfig(wayland-server) pkgconfig(x11) pkgconfig(xfixes) pkgconfig(xi)"

inherit rpm
