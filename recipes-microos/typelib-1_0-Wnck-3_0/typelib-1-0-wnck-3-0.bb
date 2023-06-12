SUMMARY = "Window Navigator Construction Kit (Library Package) -- Introspection bindings"
DESCRIPTION = "The Window Navigator Construction Kit is a library that can be used to \
write task lists, pagers, and similar GNOME programs. \
 \
This package provides the GObject Introspection bindings for libwnck."
LICENSE = "LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "typelib-1_0-Wnck-3_0-43.0-3.3.aarch64.rpm"
RPM_HASH = "5de51ad49a5f314666bd65e6d0bb3d11c1dfe07544ca09ce87fd650dd937f3ca25c6c31aa6e55b3602f874805d0bd28a7a3fb29136ff3107cf4a3f79d2827aee"

RPROVIDES:${PN} += "typelib(Wnck) \
typelib-1_0-Wnck-3_0 \
typelib-1_0-Wnck-3_0(aarch-64)"
RDEPENDS:${PN} += "libwnck-3.so.0()(64bit) \
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
