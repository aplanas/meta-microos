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
This package contains a command line interface for Kid3, for a GUI you can \
use kid3-qt or kid3."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-cli-3.9.3-1.3.aarch64.rpm"
RPM_HASH = "46e6a7d3944a5db5e291ef18a30e6de8654c883abe39b864ed6500e22b5f0e2e0017afae80a3a40892a2e3420ad19f0e2e2ee6d9ccb49096c8e761442824e628"

RPROVIDES:${PN} += "kid3-cli kid3-cli(aarch-64)"
RDEPENDS:${PN} += "kid3-core ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkid3-core.so()(64bit) libreadline.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
