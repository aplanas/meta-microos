SUMMARY = "Introspection bindings for the GTK+ spell checker library"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application. \
 \
This package provides the GObject Introspection bindings for gspell."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.1"

RPM_NAME = "typelib-1_0-Gspell-1-1.12.1-1.1.aarch64.rpm"
RPM_HASH = "5c36dc219b246fd29b4895419dfe9a85637ada6a3bee6cc90de54f016e5af178b17b005868eaba11281356bc1ea04e76c3740d1fd6e5dabeeb00e08032119115"

RPROVIDES:${PN} += "typelib(Gspell) typelib-1_0-Gspell-1 typelib-1_0-Gspell-1(aarch-64)"
RDEPENDS:${PN} += "libgspell-1.so.2()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
