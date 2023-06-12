SUMMARY = "Introspection file for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains introspection file for libshumate."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "typelib-1_0-Shumate-1_0-1.0.3-1.3.aarch64.rpm"
RPM_HASH = "fb5f64e57ab66db53378eb257ad8c794c4acdefc47b3831521571e70c6dff57bbe658ee892851502fbff61b2e7927135b5d1242d00581ed7f29cf751773f4f5d"

RPROVIDES:${PN} += "typelib(Shumate) \
typelib-1_0-Shumate-1_0 \
typelib-1_0-Shumate-1_0(aarch-64)"
RDEPENDS:${PN} += "libshumate-1.0.so.1()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Graphene) \
typelib(Gsk) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(cairo) \
typelib(freetype2)"

inherit rpm
