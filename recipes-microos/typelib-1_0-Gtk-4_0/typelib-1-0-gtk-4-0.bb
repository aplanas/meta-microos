SUMMARY = "Introspection bindings for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the GObject Introspection bindings for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.3"

RPM_NAME = "typelib-1_0-Gtk-4_0-4.10.3-4.1.aarch64.rpm"
RPM_HASH = "3238165e78dac3ab386064cfeac15b064cce7d034d3eb81c5b172933b54a198a590140d5b313716d0a99391e77f7d43371f7b7296593ca97d3381640ea941bb8"

RPROVIDES:${PN} += "typelib(Gdk) \
typelib(GdkWayland) \
typelib(GdkX11) \
typelib(Gsk) \
typelib(Gtk) \
typelib-1_0-Gtk-4_0 \
typelib-1_0-Gtk-4_0(aarch-64)"
RDEPENDS:${PN} += "(python3-gobject-Gdk if python3-gobject) \
(python310-gobject-Gdk if python310-gobject) \
(python38-gobject-Gdk if python38-gobject) \
(python39-gobject-Gdk if python39-gobject) \
libgtk-4.so.1()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Graphene) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
