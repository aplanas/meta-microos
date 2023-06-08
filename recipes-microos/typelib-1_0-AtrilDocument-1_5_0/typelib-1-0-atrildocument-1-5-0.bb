SUMMARY = "Introspection bindings for MATE Desktop's AtrilDocument"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.0"

RPM_NAME = "typelib-1_0-AtrilDocument-1_5_0-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "36909d451547b1d6258679e6313bce055bc56eaec908c156a6762dd2fd38f9f0314efcc2c67083a38645567cf787f8144ab00924c784ff51fa52953a5d360a00"

RPROVIDES:${PN} += "typelib(AtrilDocument) typelib-1_0-AtrilDocument-1_5_0 typelib-1_0-AtrilDocument-1_5_0(aarch-64)"
RDEPENDS:${PN} += "libatrildocument.so.3()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
