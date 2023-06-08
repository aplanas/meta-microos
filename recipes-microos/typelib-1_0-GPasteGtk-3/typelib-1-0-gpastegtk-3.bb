SUMMARY = "Introspection bindings for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the GObject Introspection bindings for the library \
managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "typelib-1_0-GPasteGtk-3-43.2+6-2.1.aarch64.rpm"
RPM_HASH = "7424060bd1d4d13884e124d0efc06daaeb989524ff7340063f96246e5fc236da772a8ef30eeb803bc2cf55d5a346f5662054cd03b1c6d0860bd6ed6edf19e390"

RPROVIDES:${PN} += "typelib(GPasteGtk) typelib-1_0-GPasteGtk-3 typelib-1_0-GPasteGtk-3(aarch-64)"
RDEPENDS:${PN} += "libgpaste-gtk-3.so.0()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(GPaste) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
