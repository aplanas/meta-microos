SUMMARY = "Main Introspection bindings for the Budgie Desktop"
DESCRIPTION = "This package provides GObject Introspection files required for \
developing Budgie Applets using interpreted languages, such as Python \
GObject Introspection bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "typelib-1_0-Budgie-1_0-10.7.2+0-1.1.aarch64.rpm"
RPM_HASH = "0645d1a107ef4060ec2ef98c7e589f093eea457758a154d43698bc919b0be98e4cdfccc12e76e0264d3813ca57be8b07c80e8f485f0cc4a40d08a7c2aa67298b"

RPROVIDES:${PN} += "typelib(Budgie) typelib-1_0-Budgie-1_0 typelib-1_0-Budgie-1_0(aarch-64)"
RDEPENDS:${PN} += "libbudgie-plugin.so.0()(64bit) typelib(Atk) typelib(GIRepository) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(Peas) typelib(cairo) typelib(freetype2) typelib(xlib) typelib-1_0-PeasGtk-1_0"

inherit rpm
