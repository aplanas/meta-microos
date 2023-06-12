SUMMARY = "Quick Previewer for Nautilus"
DESCRIPTION = "Sushi is a quick previewer for Nautilus, the GNOME desktop file manager."
LICENSE = "SUSE-GPL-2.0-with-plugin-exception"

PV = "43.0"

RPM_NAME = "sushi-43.0-3.3.aarch64.rpm"
RPM_HASH = "e6465a0408b7fd39e9d73948c31c009abd54fbb26e43fecb3344ed92be93f66c48a6b3e6bee4223753be1d68df5ee098c989fe3613ccb39c448b84c3c7ecf344"

RPROVIDES:${PN} += "libsushi-1.0.so()(64bit) \
metainfo() \
metainfo(org.gnome.NautilusPreviewer.appdata.xml) \
sushi \
sushi(aarch-64) \
typelib(Sushi)"
RDEPENDS:${PN} += "(typelib(LOKDocView) if libreoffice) \
/usr/bin/gjs \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libevdocument3.so.4()(64bit) \
libfreetype.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
typelib(Atk) \
typelib(EvinceDocument) \
typelib(EvinceView) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gst) \
typelib(GstBase) \
typelib(GstTag) \
typelib(Gtk) \
typelib(GtkSource) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(Soup) \
typelib(Sushi) \
typelib(WebKit2) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
