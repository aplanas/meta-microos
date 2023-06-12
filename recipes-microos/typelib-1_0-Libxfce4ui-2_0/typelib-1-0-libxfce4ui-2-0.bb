SUMMARY = "UI Library for the Xfce Desktop Environment"
DESCRIPTION = "The libxfce4ui library provides a number of widgets commonly used by Xfce \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.4"

RPM_NAME = "typelib-1_0-Libxfce4ui-2_0-4.18.4-1.1.aarch64.rpm"
RPM_HASH = "2d3e4dfed002eeff7dff43673b65c46195190e922e6dfb72981d39de5aab28ea6876c2219b5ffcb88964c4188b6433ea8ffb5ba7d1c67a4061af2298fa642fbd"

RPROVIDES:${PN} += "typelib(Libxfce4ui) typelib-1_0-Libxfce4ui-2_0 typelib-1_0-Libxfce4ui-2_0(aarch-64) typelib-1_0-libxfce4ui-2_0"
RDEPENDS:${PN} += "libxfce4ui-2.so.0()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Libxfce4util) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
