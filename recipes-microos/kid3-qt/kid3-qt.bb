SUMMARY = "Efficient ID3 Tag Editor"
DESCRIPTION = "With Kid3 you can: \
  - Edit ID3v1.1 tags \
  - Edit all ID3v2.3 and ID3v2.4 frames \
  - Convert between ID3v1.1, ID3v2.3 and ID3v2.4 tags \
  - Edit tags in MP3, Ogg/Vorbis, FLAC, MPC, APE, MP4/AAC, MP2, Speex, \
    TrueAudio, WavPack, WMA, WAV, AIFF files and tracker modules (MOD, \
    S3M, IT, XM). \
  - Edit tags of multiple files, e.g. the artist, album, year and genre \
    of all files of an album typically have the same values and can be \
    set together. \
  - Generate tags from filenames \
  - Generate tags from the contents of tag fields \
  - Generate filenames from tags \
  - Generate playlist files \
  - Automatic case conversion and string translation \
  - Import and export album data \
  - Import from gnudb.org, TrackType.org, MusicBrainz, Discogs, Amazon \
 \
This package does not use KDE libraries, if you use KDE you should use kid3. \
For a commandline interface you can use kid3-cli."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-qt-3.9.3-1.3.aarch64.rpm"
RPM_HASH = "1717c2c147ebb5fa8e019be8c17eb36edba86a0ca5cbb9d0f372fc8215b46b8391fefdb1a4a28a24e03d01f68dda8d68c5d03ef4f51f91258555fb7a8cc0c633"

RPROVIDES:${PN} += "application() application(org.kde.kid3-qt.desktop) kid3-qt kid3-qt(aarch-64) metainfo() metainfo(org.kde.kid3-qt.appdata.xml) mimehandler(application/ogg) mimehandler(audio/aac) mimehandler(audio/mp4) mimehandler(audio/mpeg) mimehandler(audio/ogg) mimehandler(audio/opus) mimehandler(audio/x-aiff) mimehandler(audio/x-dsf) mimehandler(audio/x-flac) mimehandler(audio/x-flac+ogg) mimehandler(audio/x-it) mimehandler(audio/x-mod) mimehandler(audio/x-ms-wma) mimehandler(audio/x-musepack) mimehandler(audio/x-oggflac) mimehandler(audio/x-opus+ogg) mimehandler(audio/x-s3m) mimehandler(audio/x-speex) mimehandler(audio/x-speex+ogg) mimehandler(audio/x-tta) mimehandler(audio/x-vorbis+ogg) mimehandler(audio/x-wav) mimehandler(audio/x-wavpack) mimehandler(audio/x-xm) mimehandler(inode/directory)"
RDEPENDS:${PN} += "kid3-core ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkid3-core.so()(64bit) libkid3-gui.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) xdg-utils"

inherit rpm
