SUMMARY = "XReaderDocument -- Introspection Bindings"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "typelib-1_0-XreaderDocument-1_5-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "8684fa766b52a6a759ce10a6f22f00d2edecdc2d996309f10554a838ff8cd107bc7d930034b8fef9f3e02af40dbe21e7a27afcab2e103f609228e4e446350df9"

RPROVIDES:${PN} += "typelib(XreaderDocument) typelib-1_0-XreaderDocument-1_5 typelib-1_0-XreaderDocument-1_5(aarch-64) typelib-1_0-XreaderDocument-1_5_0"
RDEPENDS:${PN} += "libxreaderdocument.so.3()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
