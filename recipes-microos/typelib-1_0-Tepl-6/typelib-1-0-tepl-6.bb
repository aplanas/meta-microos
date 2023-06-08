SUMMARY = "GObject introspection bindings for libtepl"
DESCRIPTION = "Tepl is a library that eases the development of GtkSourceView-based text \
editors and IDEs. It is a continuation/rename of Gtef. \
 \
This package provides the GObject Introspection bindings for tepl."
LICENSE = "LGPL-3.0-or-later"

PV = "6.4.0"

RPM_NAME = "typelib-1_0-Tepl-6-6.4.0-1.4.aarch64.rpm"
RPM_HASH = "ba5a7ed4b34fdf34ab1323f4049bd611db62ccdf7267490ab4574755eafa65f5325203a991f92802551886f1bc0386f0a2f70a0e2dc72a680b7e574e67328e3a"

RPROVIDES:${PN} += "typelib(Tepl) typelib-1_0-Tepl-6 typelib-1_0-Tepl-6(aarch-64)"
RDEPENDS:${PN} += "libtepl-6.so.2()(64bit) typelib(Amtk) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(GtkSource) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
