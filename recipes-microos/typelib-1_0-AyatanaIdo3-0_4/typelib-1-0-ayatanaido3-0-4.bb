SUMMARY = "Ayatana Indicator Display Objects typelib"
DESCRIPTION = "Shared library providing extra GTK menu items for display in \
system indicators. \
 \
This package provides the GObject Introspection bindings for \
Ayatana Ido."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "0.9.2"

RPM_NAME = "typelib-1_0-AyatanaIdo3-0_4-0.9.2-1.4.aarch64.rpm"
RPM_HASH = "9a85d94f8ee389b2412ce05494186f593cea00a40fafce5aa10c35cfa38c3b76a40f5975c7ff19567f862f140b45e53ca281e1b51720e61b0c086e9d3fec6944"

RPROVIDES:${PN} += "typelib(AyatanaIdo3) typelib-1_0-AyatanaIdo3-0_4 typelib-1_0-AyatanaIdo3-0_4(aarch-64)"
RDEPENDS:${PN} += "libayatana-ido3-0.4.so.0()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
