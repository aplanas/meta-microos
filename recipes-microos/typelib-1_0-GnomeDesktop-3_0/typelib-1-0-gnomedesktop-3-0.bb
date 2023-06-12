SUMMARY = "Introspection bindings for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package provides the GObject Introspection bindings for \
libgnome-desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "typelib-1_0-GnomeDesktop-3_0-44.0-1.1.aarch64.rpm"
RPM_HASH = "a757bac33b7ee492bb535c8027681387750605650f9aba286e699dc3a49a643bedb523b188807c51f18b2d352959d8c3bbb66c3a5211595bd5b3bb32c9d89dec"

RPROVIDES:${PN} += "typelib(GnomeDesktop) \
typelib-1_0-GnomeDesktop-3_0 \
typelib-1_0-GnomeDesktop-3_0(aarch-64)"
RDEPENDS:${PN} += "libgnome-desktop-3.so.20()(64bit) \
typelib(Atk) \
typelib(GDesktopEnums) \
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
