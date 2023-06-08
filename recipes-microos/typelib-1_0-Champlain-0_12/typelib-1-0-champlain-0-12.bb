SUMMARY = "Library to display maps -- Introspection bindings"
DESCRIPTION = "Libchamplain is a C library providing a ClutterActor to display maps. It \
also provides a Gtk+ widget to display maps in Gtk+ applications. \
 \
This package provides the GObject Introspection bindings for \
libchamplain."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.21"

RPM_NAME = "typelib-1_0-Champlain-0_12-0.12.21-1.3.aarch64.rpm"
RPM_HASH = "261b9d31c067dbaaa4843779c85ed7ac3c11bd6feba1ffa50235deeb721aeb4d83cc16835e6841b113a86d0dea5999c9d784442bb324110e33e74ff595998aba"

RPROVIDES:${PN} += "typelib(Champlain) typelib(GtkChamplain) typelib-1_0-Champlain-0_12 typelib-1_0-Champlain-0_12(aarch-64)"
RDEPENDS:${PN} += "libchamplain-0.12.so.0()(64bit) libchamplain-gtk-0.12.so.0()(64bit) typelib(Atk) typelib(Clutter) typelib(Cogl) typelib(CoglPango) typelib(GL) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Json) typelib(Pango) typelib(PangoCairo) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
