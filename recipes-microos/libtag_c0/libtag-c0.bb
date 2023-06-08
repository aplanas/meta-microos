SUMMARY = "Audio Meta-Data Library"
DESCRIPTION = "TagLib is a library for reading and editing the meta-data of several popular \
audio formats. Currently it supports both ID3v1 and ID3v2 for MP3 files, Ogg \
Vorbis comments and ID3 tags and Vorbis comments in FLAC, MPC, Speex, WavPack \
TrueAudio, WAV, AIFF, MP4 and ASF files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13"

RPM_NAME = "libtag_c0-1.13-1.3.aarch64.rpm"
RPM_HASH = "f2e36284a6dd18b5439d50bd88bb46f33bb068d3c61de68c9c4aa2903183c8f0bdb2cf7eab104691aa2756401def2437d02c9ebfbecc086048c02d27c3ae6385"

RPROVIDES:${PN} += "libtag_c.so.0()(64bit) libtag_c0 libtag_c0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libtag.so.1()(64bit)"

inherit rpm
