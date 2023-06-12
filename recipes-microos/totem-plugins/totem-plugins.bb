SUMMARY = "Plugins for Totem Movie Player"
DESCRIPTION = "Totem is a movie player for the GNOME desktop based on GStreamer. \
 \
This package includes plugins for Totem, to add advanced features."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "totem-plugins-43.0-2.3.aarch64.rpm"
RPM_HASH = "442d2b537581280cbd3ec690eaef8673ebd65fa7d443cfa6f842e0e219fe0bee4cce2ebfb86c42f12f206c3bac3df5f0c086dd4669eeaaf2025b86923630e730"

RPROVIDES:${PN} += "libapple-trailers.so()(64bit) \
libautoload-subtitles.so()(64bit) \
libmovie-properties.so()(64bit) \
libmpris.so()(64bit) \
libopen-directory.so()(64bit) \
librecent.so()(64bit) \
librotation.so()(64bit) \
libsave-file.so()(64bit) \
libscreensaver.so()(64bit) \
libscreenshot.so()(64bit) \
libskipto.so()(64bit) \
libtotem-im-status.so()(64bit) \
libvariable-rate.so()(64bit) \
libvimeo.so()(64bit) \
totem-plugins \
totem-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libportal-gtk3.so.1()(64bit) \
libportal.so.1()(64bit) \
libtotem.so.0()(64bit) \
totem \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(Gio) \
typelib(Gtk) \
typelib(Pango) \
typelib(Peas) \
typelib(Totem)"

inherit rpm
