SUMMARY = "A remote desktop client for GNOME"
DESCRIPTION = "A remote desktop client for the GNOME desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-connections-44.1-1.1.aarch64.rpm"
RPM_HASH = "1ed1b50bec122eba8464415b0a5028e35d072eb2a5a25c7f05e6a74e441dd9be6792013bb4cc7622a8b5a0b55cd891690b101808ca0d062ec1b1350255c29afa"

RPROVIDES:${PN} += "application() application(org.gnome.Connections.desktop) gnome-connections gnome-connections(aarch-64) libgtk-frdp-0.2.so()(64bit) metainfo() metainfo(org.gnome.Connections.appdata.xml) mimehandler(application/x-vnc) typelib(GtkFrdp)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfreerdp-client2.so.2()(64bit) libfreerdp2.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtk-vnc-2.0.so.0()(64bit) libgvnc-1.0.so.0()(64bit) libgvncpulse-1.0.so.0()(64bit) libhandy-1.so.0()(64bit) libhandy-1.so.0(LIBHANDY_1_0)(64bit) libsecret-1.so.0()(64bit) libwinpr2.so.2()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
