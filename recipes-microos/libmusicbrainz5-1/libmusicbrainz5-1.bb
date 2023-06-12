SUMMARY = "Library That Provides Access to the MusicBrainz Server"
DESCRIPTION = "MusicBrainz is the second generation incarnation of the CD Index. This \
server is designed to enable audio CD, MP3 and Vorbis players to \
download metadata about the music they are playing."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libmusicbrainz5-1-5.1.0-1.8.aarch64.rpm"
RPM_HASH = "09a1ca242018abf22237ea22b58b5594cc5f053381c0e5f00eb14b888761920c54996636a514299b75c7a5b288a965ba4df9d800c66a5894159737ccc4b1a9f3"

RPROVIDES:${PN} += "libmusicbrainz5-1 \
libmusicbrainz5-1(aarch-64) \
libmusicbrainz5.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libneon.so.27()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
