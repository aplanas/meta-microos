SUMMARY = "Introspection bindings for libbrasero-burn"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
 \
This package provides the GObject Introspection bindings for the \
libbrasero-burn library."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "typelib-1_0-BraseroBurn-3_2_0-3.12.3-2.7.aarch64.rpm"
RPM_HASH = "e8cacf1670b391cd44904242a8b8568fe5f2bc57aafb529ef237d1968cca109f085e7c426eafa5550d6f5d939a17adbeb36c23adb6aaaf1672c4f96d70ac7814"

RPROVIDES:${PN} += "typelib(BraseroBurn) \
typelib-1_0-BraseroBurn-3_2_0 \
typelib-1_0-BraseroBurn-3_2_0(aarch-64)"
RDEPENDS:${PN} += "libbrasero-burn3.so.1()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
