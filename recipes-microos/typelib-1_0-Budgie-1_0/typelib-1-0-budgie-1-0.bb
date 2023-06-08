SUMMARY = "Main Introspection bindings for the Budgie Desktop"
DESCRIPTION = "This package provides GObject Introspection files required for \
developing Budgie Applets using interpreted languages, such as Python \
GObject Introspection bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.1+20"

RPM_NAME = "typelib-1_0-Budgie-1_0-10.7.1+20-1.1.aarch64.rpm"
RPM_HASH = "af09633383398f95483ad6588c8ecaa3bcf395c439a8aa59e300e0c3130756c4fa9d5e8d1c7f0ca99e88fba771e8075a5ae8e126f0c977be5e2aa94ddf759ffd"

RPROVIDES:${PN} += "typelib(Budgie) typelib-1_0-Budgie-1_0 typelib-1_0-Budgie-1_0(aarch-64)"
RDEPENDS:${PN} += "libbudgie-plugin.so.0()(64bit) typelib(Atk) typelib(GIRepository) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(Peas) typelib(cairo) typelib(freetype2) typelib(xlib) typelib-1_0-PeasGtk-1_0"

inherit rpm
