SUMMARY = "Plugins for xplayer media player"
DESCRIPTION = "xplayer is a media player based on GStreamer for the Cinnamon \
desktop and others. It features a playlist, a full-screen mode, \
seek and volume controls, and complete keyboard navigation. \
 \
This package includes plugins for xplayer, to add advanced features."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.4"

RPM_NAME = "xplayer-plugins-2.4.4-1.3.aarch64.rpm"
RPM_HASH = "aa272f550cf774dfefabd21891c1d33f9b29ced99a9e76a08a16dc135f4a6341ed63a4cc3fac96b95f83e5e0813dbee24dc5e543e0a20142e1bcbb0076c47c5c"

RPROVIDES:${PN} += "libapple-trailers.so()(64bit) libautoload-subtitles.so()(64bit) libbrasero-disc-recorder.so()(64bit) libchapters.so()(64bit) libgrilo.so()(64bit) libgromit.so()(64bit) liblirc.so()(64bit) libmedia_player_keys.so()(64bit) libmovie-properties.so()(64bit) libontop.so()(64bit) librecent.so()(64bit) librotation.so()(64bit) libscreensaver.so()(64bit) libscreenshot.so()(64bit) libskipto.so()(64bit) libvimeo.so()(64bit) libxplayer-im-status.so()(64bit) xplayer-plugins xplayer-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgrilo-0.3.so.0()(64bit) libgtk-3.so.0()(64bit) liblirc_client.so.0()(64bit) libpango-1.0.so.0()(64bit) libpeas-1.0.so.0()(64bit) libwayland-server.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.3)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) libxml2.so.2(LIBXML2_2.6.8)(64bit) libxplayer.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(Gio) typelib(Gtk) typelib(Pango) typelib(Peas) typelib(Xplayer) xplayer"

inherit rpm
