SUMMARY = "A platform independent GUI for the Apple iPod"
DESCRIPTION = "gtkpod is a Platform-Independent GUI for the Apple iPod using GTK2. It \
allows you to upload songs and play lists to your iPod. It supports ID3 \
tag editing with multiple charsets for ID3 tags, detects duplicate \
songs, allows offline modification of the database with later \
synchronization, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "gtkpod-2.1.5-6.18.aarch64.rpm"
RPM_HASH = "4677a680fd1366f4cc7e985adfdb49eaf429a0d3551dec8377bc91294627eb4e8a1d2994fb3a8afb1a3af26b5b2779e7f5c8043405c8ba8bd1371763b604e106"

RPROVIDES:${PN} += "application() application(gtkpod.desktop) gtkpod gtkpod(aarch-64) libclarity.so()(64bit) libcore_prefs.so()(64bit) libcover_display.so()(64bit) libdetails_editor.so()(64bit) libexporter.so()(64bit) libexternal_player.so()(64bit) libfiletype_flac.so()(64bit) libfiletype_mp3.so()(64bit) libfiletype_mp4.so()(64bit) libfiletype_ogg.so()(64bit) libfiletype_video.so()(64bit) libfiletype_wav.so()(64bit) libinfo_display.so()(64bit) libmedia_player.so()(64bit) libmserv.so()(64bit) libphoto_editor.so()(64bit) libplaylist_display.so()(64bit) librepository_editor.so()(64bit) libsjcd.so()(64bit) libsorttab_display.so()(64bit) libtrack_display.so()(64bit)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/awk /usr/bin/perl /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFLAC.so.12()(64bit) libanjuta-3.so.0()(64bit) libatk-1.0.so.0()(64bit) libatomicparsley.so.0()(64bit) libbrasero-media3.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libclutter-1.0.so.0()(64bit) libclutter-gtk-1.0.so.0()(64bit) libcogl.so.20()(64bit) libcurl.so.4()(64bit) libdiscid.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgdl-3.so.5()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgpod.so.4()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtkpod.so.1()(64bit) libid3tag.so.0.16.2()(64bit) libmusicbrainz5.so.1()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libvorbisfile.so.3()(64bit)"

inherit rpm
