SUMMARY = "Introspection bindings for the GTK+ toolkit library (version 3)"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the GObject Introspection bindings for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "typelib-1_0-Gtk-3_0-3.24.37+70-1.1.aarch64.rpm"
RPM_HASH = "e5612a492d22e80f9ec8013458a4f0d511810d0c02146971cda9605e023478e2ed2798f07710f06477a733e2ab0525b8fb854aa12b3b3feadeef069aa8452436"

RPROVIDES:${PN} += "typelib(Gdk) typelib(GdkX11) typelib(Gtk) typelib-1_0-Gtk-3_0 typelib-1_0-Gtk-3_0(aarch-64)"
RDEPENDS:${PN} += "(python3-gobject-Gdk if python3-gobject) (python310-gobject-Gdk if python310-gobject) (python38-gobject-Gdk if python38-gobject) (python39-gobject-Gdk if python39-gobject) libgdk-3.so.0()(64bit) libgtk-3.so.0()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(GdkPixbuf) typelib(Gio) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
