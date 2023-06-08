SUMMARY = "UI Library for the Xfce Desktop Environment"
DESCRIPTION = "The libxfce4ui library provides a number of widgets commonly used by Xfce \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.3"

RPM_NAME = "typelib-1_0-Libxfce4ui-2_0-4.18.3-1.1.aarch64.rpm"
RPM_HASH = "bd9ae50f24ba30c1a44590b80c61005ea4099e9c5a5a95fd589ad3cf0b62c1043454fde875379768f54896968a1358b8a6e53d4b6eccc06a39f1003c2f082fd2"

RPROVIDES:${PN} += "typelib(Libxfce4ui) typelib-1_0-Libxfce4ui-2_0 typelib-1_0-Libxfce4ui-2_0(aarch-64) typelib-1_0-libxfce4ui-2_0"
RDEPENDS:${PN} += "libxfce4ui-2.so.0()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Libxfce4util) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
