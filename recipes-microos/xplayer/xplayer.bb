SUMMARY = "Generic media player"
DESCRIPTION = "xplayer is a media player based on GStreamer for the Cinnamon \
desktop and others. It features a playlist, a full-screen mode, \
seek and volume controls, and complete keyboard navigation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.4"

RPM_NAME = "xplayer-2.4.4-1.3.aarch64.rpm"
RPM_HASH = "1ed1baad44c623fcc6db8b4b74f5c4c13e755ba56d14a557c5d23b7459389fd94a0bc4020fcf4223a4b2d5b85b068582ca02d3943df3601cd43d44d3c528f3ce"

RPROVIDES:${PN} += "application() \
application(xplayer.desktop) \
libxplayer.so.0()(64bit) \
mimehandler(application/mxf) \
mimehandler(application/ogg) \
mimehandler(application/ram) \
mimehandler(application/sdp) \
mimehandler(application/smil) \
mimehandler(application/smil+xml) \
mimehandler(application/vnd.apple.mpegurl) \
mimehandler(application/vnd.ms-wpl) \
mimehandler(application/x-extension-m4a) \
mimehandler(application/x-extension-mp4) \
mimehandler(application/x-flac) \
mimehandler(application/x-flash-video) \
mimehandler(application/x-matroska) \
mimehandler(application/x-netshow-channel) \
mimehandler(application/x-ogg) \
mimehandler(application/x-quicktime-media-link) \
mimehandler(application/x-quicktimeplayer) \
mimehandler(application/x-shorten) \
mimehandler(application/x-smil) \
mimehandler(application/xspf+xml) \
mimehandler(audio/3gpp) \
mimehandler(audio/AMR) \
mimehandler(audio/AMR-WB) \
mimehandler(audio/ac3) \
mimehandler(audio/basic) \
mimehandler(audio/flac) \
mimehandler(audio/midi) \
mimehandler(audio/mp2) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/ogg) \
mimehandler(audio/prs.sid) \
mimehandler(audio/x-aiff) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-gsm) \
mimehandler(audio/x-it) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-matroska) \
mimehandler(audio/x-mod) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-asf) \
mimehandler(audio/x-ms-asx) \
mimehandler(audio/x-ms-wax) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-pn-aiff) \
mimehandler(audio/x-pn-au) \
mimehandler(audio/x-pn-wav) \
mimehandler(audio/x-pn-windows-acm) \
mimehandler(audio/x-s3m) \
mimehandler(audio/x-sbc) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-speex) \
mimehandler(audio/x-stm) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(audio/x-xm) \
mimehandler(image/x-pict) \
mimehandler(misc/ultravox) \
mimehandler(text/google-video-pointer) \
mimehandler(text/x-google-video-pointer) \
mimehandler(video/3gp) \
mimehandler(video/3gpp) \
mimehandler(video/divx) \
mimehandler(video/dv) \
mimehandler(video/fli) \
mimehandler(video/flv) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mp4v-es) \
mimehandler(video/mpeg) \
mimehandler(video/msvideo) \
mimehandler(video/ogg) \
mimehandler(video/quicktime) \
mimehandler(video/vivo) \
mimehandler(video/vnd.divx) \
mimehandler(video/vnd.mpegurl) \
mimehandler(video/vnd.vivo) \
mimehandler(video/webm) \
mimehandler(video/x-anim) \
mimehandler(video/x-avi) \
mimehandler(video/x-flc) \
mimehandler(video/x-fli) \
mimehandler(video/x-flic) \
mimehandler(video/x-flv) \
mimehandler(video/x-m4v) \
mimehandler(video/x-matroska) \
mimehandler(video/x-mpeg) \
mimehandler(video/x-mpeg2) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-asx) \
mimehandler(video/x-ms-wm) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-ms-wmx) \
mimehandler(video/x-ms-wvx) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-nsv) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-theora+ogg) \
mimehandler(video/x-xplayer-stream) \
mimehandler(x-content/video-dvd) \
mimehandler(x-content/video-svcd) \
mimehandler(x-content/video-vcd) \
mimehandler(x-scheme-handler/icy) \
mimehandler(x-scheme-handler/icyx) \
mimehandler(x-scheme-handler/mms) \
mimehandler(x-scheme-handler/mmsh) \
mimehandler(x-scheme-handler/net) \
mimehandler(x-scheme-handler/pnm) \
mimehandler(x-scheme-handler/rtmp) \
mimehandler(x-scheme-handler/rtp) \
mimehandler(x-scheme-handler/rtsp) \
mimehandler(x-scheme-handler/uvox) \
typelib(Xplayer) \
xplayer \
xplayer(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
gstreamer-plugin-cluttergst3 \
gstreamer-plugins-bad \
gstreamer-plugins-base \
gstreamer-plugins-good \
iso-codes \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libclutter-1.0.so.0()(64bit) \
libclutter-gst-3.0.so.0()(64bit) \
libclutter-gtk-1.0.so.0()(64bit) \
libcogl.so.20()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libpeas-gtk-1.0.so.0()(64bit) \
libxapp.so.1()(64bit) \
libxplayer-plparser.so.18()(64bit) \
python3-gobject-Gdk \
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
typelib(XplayerPlParser) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib) \
xplayer-plugins"

inherit rpm
