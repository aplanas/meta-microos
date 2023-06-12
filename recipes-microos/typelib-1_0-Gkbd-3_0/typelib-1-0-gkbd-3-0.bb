SUMMARY = "Introspection bindings for libgnomekbd"
DESCRIPTION = "GNOME keyboard library and utility. \
 \
This package provides the GObject Introspection bindings for \
libgnomekbd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "typelib-1_0-Gkbd-3_0-3.28.1-1.3.aarch64.rpm"
RPM_HASH = "a563bb7a12b9adaff3d7d11f3f10e71b3d1b687375271a44a492432a974a899b212cd0d6f7e09144e4c55bb9362fab225297dc34e02aeb0d19fc4980ba92cdec"

RPROVIDES:${PN} += "typelib(Gkbd) \
typelib-1_0-Gkbd-3_0 \
typelib-1_0-Gkbd-3_0(aarch-64)"
RDEPENDS:${PN} += "libgnomekbd.so.8()(64bit) \
libgnomekbdui.so.8()(64bit) \
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
typelib(Xkl) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
