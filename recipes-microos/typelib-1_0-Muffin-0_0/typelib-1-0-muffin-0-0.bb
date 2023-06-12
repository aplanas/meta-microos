SUMMARY = "Muffin Introspection bindings"
DESCRIPTION = "Cinnamon Desktop default window manager. \
Muffin uses GTK+ and Clutter to do everything. \
 \
This package provides the GObject Introspection bindings for muffin."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.2.1"

RPM_NAME = "typelib-1_0-Muffin-0_0-5.2.1-1.1.aarch64.rpm"
RPM_HASH = "cb04b0f17731dcc7dccd82e0da15fcbcc80feeb8b2754d12d6ca8b722da1c07e53fbaaad39c87aef67fdb35754990bf1bcbee8ba2ae19e9b19cdaaac3930135e"

RPROVIDES:${PN} += "typelib(Cally) typelib(Clutter) typelib(ClutterX11) typelib(Cogl) typelib(CoglPango) typelib(Meta) typelib-1_0-Muffin-0_0 typelib-1_0-Muffin-0_0(aarch-64)"
RDEPENDS:${PN} += "libmuffin-clutter-0.so()(64bit) libmuffin-cogl-0.so()(64bit) libmuffin-cogl-pango-0.so()(64bit) libmuffin-cogl-path-0.so()(64bit) libmuffin.so.0()(64bit) typelib(Atk) typelib(CDesktopEnums) typelib(GL) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Json) typelib(Pango) typelib(PangoCairo) typelib(cairo) typelib(freetype2) typelib(xfixes) typelib(xlib)"

inherit rpm
