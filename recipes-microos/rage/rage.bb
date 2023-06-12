SUMMARY = "A mplayer like video and audio player with some extra bells and whistles"
DESCRIPTION = "Rage is a simple video and audio player intended to be slick yet simplistic, much like Mplayer. You can provide 1 or \
more files to play on the command-line or just DND files onto the rage window to insert them into the playlist. \
You can get a visual representation of everything on the playlist by hitting the / key, or just hovering your mouse over \
the right side of the window. Mouse back over the left side of the window ti dismiss it or press the key again. \
It has a full complement of key controls if you see the README for the full list. It will automatically search for \
album art for music files, if not already cached, and display that. It even generates thumbnails for the timeline \
of a video and allows you to preview the position on mouseover of the position bar at the bottom of the window."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "rage-0.4.0-1.7.aarch64.rpm"
RPM_HASH = "317482216f4cee142b1287d13cd36159e66cca95b6a0a8b1abb47c2b3913695394f9ed23649cd52541eeab18ce2dcd861df34e69c58a83a964605cdaf61df6eb"

RPROVIDES:${PN} += "application() \
application(rage.desktop) \
mimehandler(application/mxf) \
mimehandler(application/ogg) \
mimehandler(application/ram) \
mimehandler(application/sdp) \
mimehandler(application/smil) \
mimehandler(application/smil+xml) \
mimehandler(application/vnd.ms-wpl) \
mimehandler(application/vnd.rn-realmedia) \
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
mimehandler(audio/midi) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/ogg) \
mimehandler(audio/prs.sid) \
mimehandler(audio/vnd.rn-realaudio) \
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
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-pn-realaudio-plugin) \
mimehandler(audio/x-pn-wav) \
mimehandler(audio/x-pn-windows-acm) \
mimehandler(audio/x-real-audio) \
mimehandler(audio/x-realaudio) \
mimehandler(audio/x-sbc) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-speex) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(audio/x-xm) \
mimehandler(image/vnd.rn-realpix) \
mimehandler(image/x-pict) \
mimehandler(inode/directory) \
mimehandler(misc/ultravox) \
mimehandler(text/google-video-pointer) \
mimehandler(text/x-google-video-pointer) \
mimehandler(video/3gpp) \
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
mimehandler(video/vnd.rn-realvideo) \
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
mimehandler(video/x-totem-stream) \
mimehandler(x-content/video-dvd) \
mimehandler(x-content/video-svcd) \
mimehandler(x-content/video-vcd) \
rage \
rage(aarch-64)"
RDEPENDS:${PN} += "efl \
elementary \
evas-generic-loaders \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libecore.so.1()(64bit) \
libecore_con.so.1()(64bit) \
libecore_file.so.1()(64bit) \
libedje.so.1()(64bit) \
libeet.so.1()(64bit) \
libefreet.so.1()(64bit) \
libeina.so.1()(64bit) \
libeio.so.1()(64bit) \
libeldbus.so.1()(64bit) \
libelementary.so.1()(64bit) \
libemotion.so.1()(64bit) \
libevas.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
