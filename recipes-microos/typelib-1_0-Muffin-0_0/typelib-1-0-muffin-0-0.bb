SUMMARY = "Muffin Introspection bindings"
DESCRIPTION = "Cinnamon Desktop default window manager. \
Muffin uses GTK+ and Clutter to do everything. \
 \
This package provides the GObject Introspection bindings for muffin."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.2.0"

RPM_NAME = "typelib-1_0-Muffin-0_0-5.2.0-1.9.aarch64.rpm"
RPM_HASH = "0ebe3cde1554dc9bca3b394a7f3a0b6bdd63445a72b317d61f7dba4c34d43e5447a7eb4c67f23f14c01d98949210e451197560ffa86a582dd55fa7463b02a58b"

RPROVIDES:${PN} += "typelib(Cally) typelib(Clutter) typelib(ClutterX11) typelib(Cogl) typelib(CoglPango) typelib(Meta) typelib-1_0-Muffin-0_0 typelib-1_0-Muffin-0_0(aarch-64)"
RDEPENDS:${PN} += "libmuffin-clutter-0.so()(64bit) libmuffin-cogl-0.so()(64bit) libmuffin-cogl-pango-0.so()(64bit) libmuffin-cogl-path-0.so()(64bit) libmuffin.so.0()(64bit) typelib(Atk) typelib(CDesktopEnums) typelib(GL) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Json) typelib(Pango) typelib(PangoCairo) typelib(cairo) typelib(freetype2) typelib(xfixes) typelib(xlib)"

inherit rpm
