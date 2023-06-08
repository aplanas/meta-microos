SUMMARY = "MATE Desktop keyboard configuration typelib"
DESCRIPTION = "This package provides libmatekdb, an API to manage the keyboard in \
MATE Desktop applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "typelib-1_0-Matekbd-1_0-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "4fe51a907e1762f292e8d78fc43f360d6275bfb72f759f2d1d08790320f68ce1282305d90f3e5ec01d1c96fbde74e5a3211c89b80160e73c46394d18759a1aab"

RPROVIDES:${PN} += "typelib(Matekbd) typelib-1_0-Matekbd-1_0 typelib-1_0-Matekbd-1_0(aarch-64)"
RDEPENDS:${PN} += "libmatekbd.so.4()(64bit) libmatekbdui.so.4()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(Xkl) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
