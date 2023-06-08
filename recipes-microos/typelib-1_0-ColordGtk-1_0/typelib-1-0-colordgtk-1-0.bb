SUMMARY = "GTK Integration Introspection bindings for colord-gtk"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides the GObject Introspection bindings for the \
libcolord-gtk library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "typelib-1_0-ColordGtk-1_0-0.3.0-1.4.aarch64.rpm"
RPM_HASH = "11cf0a9125e86f4719c7356e890e6e12757885793ae282d6249948f31d3e09607418b0ccfded2e674b8ed14f08917fdf4fe853cd4170a47dbad73204291f5233"

RPROVIDES:${PN} += "typelib(ColordGtk) typelib-1_0-ColordGtk-1_0 typelib-1_0-ColordGtk-1_0(aarch-64)"
RDEPENDS:${PN} += "libcolord-gtk.so.1()(64bit) typelib(Atk) typelib(Colord) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
