SUMMARY = "Introspection bindings for Adwaita"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the GObject Introspection bindings for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.2"

RPM_NAME = "typelib-1_0-Adw-1-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "03e6979b224ee1285c0cc6b3115345ce80fe1c7df6c484d84853a1e36dd3269aec68a80dabb9eb617a784d0cb2ca67b4e9a03e6b00b7ec56482240266285d552"

RPROVIDES:${PN} += "typelib(Adw) typelib-1_0-Adw-1 typelib-1_0-Adw-1(aarch-64)"
RDEPENDS:${PN} += "libadwaita-1.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Graphene) typelib(Gsk) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(PangoCairo) typelib(cairo) typelib(freetype2)"

inherit rpm
