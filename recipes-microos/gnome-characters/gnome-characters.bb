SUMMARY = "Character Map"
DESCRIPTION = "A simple utility application to find and insert unusual characters."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-characters-44.0-2.1.aarch64.rpm"
RPM_HASH = "488481738273cb66a2a02f9580c0e3e46e1f4c7b478f652d193b6b2cf29e4173df4bb07e9d99a81bbf6defe97fe82ff9f889a4680767f599c0ffaaef01a13fb4"

RPROVIDES:${PN} += "application() \
application(org.gnome.Characters.desktop) \
gnome-characters \
gnome-characters(aarch-64) \
libgc.so()(64bit) \
metainfo() \
metainfo(org.gnome.Characters.appdata.xml) \
typelib(Gc)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
typelib(Adw) \
typelib(GLib) \
typelib(GObject) \
typelib(Gc) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(GnomeDesktop) \
typelib(Graphene) \
typelib(Gsk) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(IBus) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(cairo) \
typelib(freetype2)"

inherit rpm
