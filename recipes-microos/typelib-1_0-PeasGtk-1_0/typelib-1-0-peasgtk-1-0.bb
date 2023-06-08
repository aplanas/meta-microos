SUMMARY = "Introspection bindings for the libpeas-gtk library"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package provides the GObject Introspection bindings for the \
libpeas-gtk library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "typelib-1_0-PeasGtk-1_0-1.36.0-1.1.aarch64.rpm"
RPM_HASH = "23d0445dd3f4a83f0935c333c3290f6e28c3face263e118359e656bbb10f9592515abca497912c2935a42766f5aea0390416b630e28735138ebead32618ae459"

RPROVIDES:${PN} += "typelib(PeasGtk) typelib-1_0-PeasGtk-1_0 typelib-1_0-PeasGtk-1_0(aarch-64)"
RDEPENDS:${PN} += "libpeas-gtk-1.0.so.0()(64bit) typelib(Atk) typelib(GIRepository) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(Peas) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
