SUMMARY = "Efficient ID3 Tag Editor"
DESCRIPTION = "f you want to easily tag multiple MP3, Ogg/Vorbis, Opus, DSF, FLAC, \
MPC, MP4/AAC, MP2, Opus, Speex, TrueAudio, WavPack and WMA files \
(e.g. full albums) without typing the same information again and \
again and have control over both ID3v1 and ID3v2 tags, \
then Kid3 is the program you are looking for. \
 \
With Kid3 you can: \
- Edit ID3v1.1 tags \
- Edit all ID3v2.3 and ID3v2.4 frames \
- Convert between ID3v1.1, ID3v2.3 and ID3v2.4 tags \
- Edit tags in MP3, Ogg/Vorbis, FLAC, MPC, MP4/AAC, MP2, Speex, \
  TrueAudio, WavPack, WMA, AIFF and WAV files \
- Edit tags of multiple files, e.g. the artist, album, year and \
  genre of all files of an album typically have the same values \
  and can be set together. \
- Generate tags from filenames \
- Generate tags from the contents of tag fields \
- Generate filenames from tags \
- Rename and create directories from tags \
- Generate playlist files \
- Automatically convert upper and lower case and replace strings \
- Import from freedb2.org, MusicBrainz, Discogs, Amazon and other \
  sources of album data \
- Export tags as CSV, HTML, playlists, Kover XML and in other formats \
- Edit synchronized lyrics and event timing codes,import and export LRC files \
 \
This package uses KDE libraries, if you do not use KDE you should use kid3-qt. \
For a commandline interface you can use kid3-cli."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-3.9.3-1.3.aarch64.rpm"
RPM_HASH = "e5c60b500e88b1de7bbf9f2d9f772da18a088602144d6cdb66d63c28a79c87e67d1005c7b7c3445c7ddf7c833bb00b5598075450332ea7068782cab1d1568d7d"

RPROVIDES:${PN} += "application() application(org.kde.kid3.desktop) kid3 kid3(aarch-64) metainfo() metainfo(org.kde.kid3.appdata.xml) mimehandler(application/ogg) mimehandler(audio/aac) mimehandler(audio/mp4) mimehandler(audio/mpeg) mimehandler(audio/ogg) mimehandler(audio/opus) mimehandler(audio/x-aiff) mimehandler(audio/x-dsf) mimehandler(audio/x-flac) mimehandler(audio/x-flac+ogg) mimehandler(audio/x-it) mimehandler(audio/x-mod) mimehandler(audio/x-ms-wma) mimehandler(audio/x-musepack) mimehandler(audio/x-oggflac) mimehandler(audio/x-opus+ogg) mimehandler(audio/x-s3m) mimehandler(audio/x-speex) mimehandler(audio/x-speex+ogg) mimehandler(audio/x-tta) mimehandler(audio/x-vorbis+ogg) mimehandler(audio/x-wav) mimehandler(audio/x-wavpack) mimehandler(audio/x-xm) mimehandler(inode/directory)"
RDEPENDS:${PN} += "kid3-core ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkid3-core.so()(64bit) libkid3-gui.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libxslt-tools xdg-utils"

inherit rpm
