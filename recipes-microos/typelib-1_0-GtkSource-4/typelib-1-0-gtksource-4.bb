SUMMARY = "GTK+ Source Editing Widget -- Introspection bindings"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor. \
 \
This package provides the GObject Introspection bindings for \
GtkSourceView."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8.4"

RPM_NAME = "typelib-1_0-GtkSource-4-4.8.4-1.3.aarch64.rpm"
RPM_HASH = "5eea694da8ff51f5d5b20970e02f54011ced47ad19ab9e1387e74f93c496105d09ac9ec5b34ec835e8203afe8d15f93ccc7da4dd89504ae16ce8821515c2658d"

RPROVIDES:${PN} += "typelib(GtkSource) typelib-1_0-GtkSource-4 typelib-1_0-GtkSource-4(aarch-64)"
RDEPENDS:${PN} += "libgtksourceview-4.so.0()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
