SUMMARY = "Introspection bindings for the GTK+ source editing widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor. \
 \
This package provides the GObject Introspection bindings for \
GtkSourceView."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.11"

RPM_NAME = "typelib-1_0-GtkSource-3_0-3.24.11-3.9.aarch64.rpm"
RPM_HASH = "5f0abf0e9bdc1256cd351eb0211854e5f6b4fbb9ea09543351b12070d87cb1696e56c9e8d6e3de1f683ca75ef0658a4d0d1c3caeb6009331407748d18f4b997d"

RPROVIDES:${PN} += "typelib(GtkSource) \
typelib-1_0-GtkSource-3_0 \
typelib-1_0-GtkSource-3_0(aarch-64)"
RDEPENDS:${PN} += "libgtksourceview-3.0.so.1()(64bit) \
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
