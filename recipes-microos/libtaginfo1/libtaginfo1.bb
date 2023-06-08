SUMMARY = "Library for reading media metadata (tags)"
DESCRIPTION = "libtaginfo is a convenience wrapper for taglib with C and vala \
bindings. \
 \
Features are reading/writing fields like: Artist, Album, Title, Genre, \
AlbumArtist, Comments, Disk number, Compilation flag, User labels, \
Embedded Images, Lyrics, Audio properties (length, bitrate, samplerate, \
channels ...), ..."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "libtaginfo1-0.2.1-2.4.aarch64.rpm"
RPM_HASH = "9aeaf11e2e8ecd72d2371a0d962b59e831f79f34f4c8990eba0fb4b6b86b5ea3b8351b456778c062183b775084cfff811d56bb287765d919008662ea47e8f5b3"

RPROVIDES:${PN} += "libtaginfo.so.1()(64bit) libtaginfo1 libtaginfo1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtag.so.1()(64bit)"

inherit rpm
