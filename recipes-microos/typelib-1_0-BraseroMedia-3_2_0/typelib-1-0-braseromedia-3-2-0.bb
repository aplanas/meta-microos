SUMMARY = "GObject introspection bindings for libbrasero-media"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
 \
This package provides the GObject Introspection bindings for the \
libbrasero-media library."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "typelib-1_0-BraseroMedia-3_2_0-3.12.3-2.7.aarch64.rpm"
RPM_HASH = "e59bd0c383ce7ab4970ce9a6b4e0bbf9a9ded9061b22418a67f5551911ef1d8618bb1748e46c90d4b78519e13c9cb53c1a23f77c5da4778d4d2ae3105a976fce"

RPROVIDES:${PN} += "typelib(BraseroMedia) \
typelib-1_0-BraseroMedia-3_2_0 \
typelib-1_0-BraseroMedia-3_2_0(aarch-64)"
RDEPENDS:${PN} += "libbrasero-media3.so.1()(64bit) \
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
