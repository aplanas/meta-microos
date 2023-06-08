SUMMARY = "Introspection bindings for MATE Desktop's AtrilView"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.0"

RPM_NAME = "typelib-1_0-AtrilView-1_5_0-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "9e9f5fe9c6ea8e1cff5701dc5043f100a71dd2f656681e22e47f1a4be735a082fadfbcef63de576a6f213f5be43ef984dcc095d3dfccebcbd5757ff745567155"

RPROVIDES:${PN} += "typelib(AtrilView) typelib-1_0-AtrilView-1_5_0 typelib-1_0-AtrilView-1_5_0(aarch-64)"
RDEPENDS:${PN} += "libatrilview.so.3()(64bit) typelib(Atk) typelib(AtrilDocument) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
