SUMMARY = "Introspection bindings for GOffice"
DESCRIPTION = "GOffice is a GLib/GTK+ set of document-centric objects and utilities. \
 \
This package provides the GObject Introspection bindings for GOffice."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.10.55"

RPM_NAME = "typelib-1_0-GOffice-0_10-0.10.55-1.3.aarch64.rpm"
RPM_HASH = "d398e9f794f8ef11d0746beca09c7e0e444855468b07d72738aa1aeabdaa7c7cc2ee0191f1e107064e61be9f9349be60560acb5e0f2c1255233d353a5781b1d9"

RPROVIDES:${PN} += "typelib(GOffice) typelib-1_0-GOffice-0_10 typelib-1_0-GOffice-0_10(aarch-64)"
RDEPENDS:${PN} += "libgoffice-0.10.so.10()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gsf) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(libxml2) typelib(xlib)"

inherit rpm
