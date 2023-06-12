SUMMARY = "Xfce Panel Shared Library"
DESCRIPTION = "GObject introspection bindings for Xfce Panel"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.4"

RPM_NAME = "typelib-1_0-Libxfce4panel-2_0-4.18.4-1.1.aarch64.rpm"
RPM_HASH = "77596c94614eb919da8cf1c764f77e63abc77798cff40b2d5026cc6a8031ecaeb3f9fa87481ea0bf80a6496efe127bc16bb6b9f5cbe42da77b83f92414e42a2e"

RPROVIDES:${PN} += "typelib(Libxfce4panel) typelib-1_0-Libxfce4panel-2_0 typelib-1_0-Libxfce4panel-2_0(aarch-64)"
RDEPENDS:${PN} += "libxfce4panel-2.0.so.4()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Libxfce4util) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
