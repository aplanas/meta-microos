SUMMARY = "Introspection bindings for the GTK+ toolkit library (version 3)"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the GObject Introspection bindings for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "typelib-1_0-Gtk-3_0-3.24.38-1.1.aarch64.rpm"
RPM_HASH = "a21a0e92737422f84993e4d355ebd1be6a49733b8f82cf3e38868d9b7f83996b8795e8ae173af03c4b08e86c2b0f3258c4ea6a1f3f22a50f09d5ba39701ac540"

RPROVIDES:${PN} += "typelib(Gdk) \
typelib(GdkX11) \
typelib(Gtk) \
typelib-1_0-Gtk-3_0 \
typelib-1_0-Gtk-3_0(aarch-64)"
RDEPENDS:${PN} += "(python3-gobject-Gdk if python3-gobject) \
(python310-gobject-Gdk if python310-gobject) \
(python38-gobject-Gdk if python38-gobject) \
(python39-gobject-Gdk if python39-gobject) \
libgdk-3.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
