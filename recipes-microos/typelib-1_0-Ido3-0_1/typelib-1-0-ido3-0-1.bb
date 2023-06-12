SUMMARY = "Indicator Display Objects typelib"
DESCRIPTION = "Shared library providing extra GTK+ menu items for display in \
system indicators. \
 \
This package provides the GObject Introspection bindings for Ido."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "13.10.0+bzr20161028"

RPM_NAME = "typelib-1_0-Ido3-0_1-13.10.0+bzr20161028-3.16.aarch64.rpm"
RPM_HASH = "fdca40bfe7fa3348f8531978e9dee4a90d9c02388f5c94fb27996165581a641810e908e9eddb9d1b3ff69b7f25f83d9ede4bf379ac30b9a01a725cb7096f24c8"

RPROVIDES:${PN} += "typelib(Ido3) \
typelib-1_0-Ido3-0_1 \
typelib-1_0-Ido3-0_1(aarch-64)"
RDEPENDS:${PN} += "libido3-0.1.so.0()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
