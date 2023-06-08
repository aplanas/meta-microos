SUMMARY = "Raven Introspection bindings for the Budgie Desktop"
DESCRIPTION = "This package provides GObject Introspection files required for \
developing Budgie Raven plugins using interpreted languages, such as Python \
GObject Introspection bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.1+20"

RPM_NAME = "typelib-1_0-BudgieRaven-1_0-10.7.1+20-1.1.aarch64.rpm"
RPM_HASH = "60a3b40349a017fbc26d79a8af62aa4176ea81d7425ada30b81c0e8c2b6391f115e9b8863f9a8f4c4f2da982d1e34df47a4243477393d1642c5dbfccf6570e40"

RPROVIDES:${PN} += "typelib(BudgieRaven) typelib-1_0-BudgieRaven-1_0 typelib-1_0-BudgieRaven-1_0(aarch-64)"
RDEPENDS:${PN} += "libbudgie-raven-plugin.so.0()(64bit) typelib(Atk) typelib(GIRepository) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(Peas) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
