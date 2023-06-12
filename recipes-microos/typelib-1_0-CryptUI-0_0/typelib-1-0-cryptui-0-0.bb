SUMMARY = "Introspection bindings for libcryptui, a PGP key prompting library"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys. \
 \
This package provides the GObject Introspection bindings for \
libcryptui."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.2"

RPM_NAME = "typelib-1_0-CryptUI-0_0-3.12.2-10.3.aarch64.rpm"
RPM_HASH = "3a41e8dc5dde38ffb2371f6ccb6cc9c77a3b171cd1a2fd523295ba152967166f2ad648089a845cea91dddc864cf1acf4d7267441b50707d762879cf3ec7cef1d"

RPROVIDES:${PN} += "typelib(CryptUI) \
typelib-1_0-CryptUI-0_0 \
typelib-1_0-CryptUI-0_0(aarch-64)"
RDEPENDS:${PN} += "libcryptui.so.0()(64bit) \
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
