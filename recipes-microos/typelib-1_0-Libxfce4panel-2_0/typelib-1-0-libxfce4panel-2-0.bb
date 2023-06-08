SUMMARY = "Xfce Panel Shared Library"
DESCRIPTION = "GObject introspection bindings for Xfce Panel"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.3"

RPM_NAME = "typelib-1_0-Libxfce4panel-2_0-4.18.3-1.1.aarch64.rpm"
RPM_HASH = "0583e1af4eba13a42134748715b0758cec2387ab9234f8dafba9c4e0b3e866861517517c0e0ddfb06df8330494e1c020a0df4cd307ce8a60b529675e12f9b89d"

RPROVIDES:${PN} += "typelib(Libxfce4panel) typelib-1_0-Libxfce4panel-2_0 typelib-1_0-Libxfce4panel-2_0(aarch-64)"
RDEPENDS:${PN} += "libxfce4panel-2.0.so.4()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Libxfce4util) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
