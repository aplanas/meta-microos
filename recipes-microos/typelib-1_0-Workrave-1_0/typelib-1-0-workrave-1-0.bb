SUMMARY = "Introspection bindings for Workrave"
DESCRIPTION = "This package contains typelib files needed for developing plugins for \
Workrave."
LICENSE = "GPL-3.0-only"

PV = "1.10.50"

RPM_NAME = "typelib-1_0-Workrave-1_0-1.10.50-2.1.aarch64.rpm"
RPM_HASH = "a96de697db0de836c80c9c4e2606ff51d5943c4c2e0d2a2a8980fda50fe10a497b05d9e192710c49f590e5551475d6a47419644671d17ea8b52e39b4b9449239"

RPROVIDES:${PN} += "typelib(Workrave) typelib-1_0-Workrave-1_0 typelib-1_0-Workrave-1_0(aarch-64)"
RDEPENDS:${PN} += "libworkrave-private-1.0.so.0()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib) workrave"

inherit rpm
