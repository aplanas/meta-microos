SUMMARY = "Introspection bindings for the Anjuta plugin library"
DESCRIPTION = "Anjuta is a versatile Integrated Development Environment (IDE) for the \
GNOME desktop. \
 \
This package provides the GObject Introspection bindings for the Anjuta \
library to develop plugins."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "typelib-1_0-Anjuta-3_0-3.34.0-5.6.aarch64.rpm"
RPM_HASH = "be640cfafca1e8ffca7d2ea3eef1445ad377d9cea3c35465bac6091415d425144946392ca3ca203b3ef6f52532423e616399d41358af9161843519c552f15566"

RPROVIDES:${PN} += "typelib(Anjuta) typelib(IAnjuta) typelib-1_0-Anjuta-3_0 typelib-1_0-Anjuta-3_0(aarch-64)"
RDEPENDS:${PN} += "libanjuta-3.so.0()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gdl) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
