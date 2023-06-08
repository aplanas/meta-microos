SUMMARY = "Framework for browsing and searching media content -- Playlist Helper Library"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.15"

RPM_NAME = "libgrlpls-0_3-0-0.3.15-2.1.aarch64.rpm"
RPM_HASH = "1bec480a1407e0097bd274b1fa2e98a67778c67c0dce2de2a42dac037f4aa86dbae6f2861888595c55141c8305000c8614722c5c3a0053e9070c883cc25fe77d"

RPROVIDES:${PN} += "libgrlpls-0.3.so.0()(64bit) libgrlpls-0_3-0 libgrlpls-0_3-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgrilo-0.3.so.0()(64bit) libtotem-plparser.so.18()(64bit) libtotem-plparser.so.18(LIBTOTEM_PL_PARSER_MINI_1.0)(64bit)"

inherit rpm
