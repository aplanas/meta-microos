SUMMARY = "Introspection bindings for the Gnome Devtool libraries"
DESCRIPTION = "Gnome Devtool Libraries contains components and libraries that are \
intended to be shared between GNOME development tools, including \
gnome-debug, gnome-build, and anjuta2. \
 \
This package provides the GObject Introspection bindings for GDL."
LICENSE = "LGPL-2.1-or-later"

PV = "3.40.0"

RPM_NAME = "typelib-1_0-Gdl-3-3.40.0-2.9.aarch64.rpm"
RPM_HASH = "488e5dc61e5ca58ee06a50fdebb8d1ba418556d82b4f4d3edd82e9a2aee35038e0302f248ddeeaff59d7edf8e6522ef6ef7f1d673827ca8e13f0d223bb59aea5"

RPROVIDES:${PN} += "typelib(Gdl) \
typelib-1_0-Gdl-3 \
typelib-1_0-Gdl-3(aarch-64)"
RDEPENDS:${PN} += "libgdl-3.so.5()(64bit) \
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
