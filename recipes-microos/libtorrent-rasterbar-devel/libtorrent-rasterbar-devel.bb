SUMMARY = "Header files for libtorrent, a C++ implementation of the BitTorrent protocol"
DESCRIPTION = "libtorrent-rasterbar is a C++ library that aims to be a good \
alternative to all the other bittorrent implementations around. \
It is a library and not a full featured client, although it comes \
with a working example client. \
 \
This package holds the development files for libtorrent-rasterbar."
LICENSE = "BSD-3-Clause"

PV = "2.0.8"

RPM_NAME = "libtorrent-rasterbar-devel-2.0.8-2.2.aarch64.rpm"
RPM_HASH = "72409a401134969255681d406697193aeeae69d9e7992dfb5fc7361ffe007f84275616d3ffe72aa0124690d3b0b2f75c66d999d3bb1168d4a0c9d66b3137eaba"

RPROVIDES:${PN} += "cmake(LibtorrentRasterbar) libtorrent-rasterbar-devel libtorrent-rasterbar-devel(aarch-64) pkgconfig(libtorrent-rasterbar)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gcc-c++ libboost_headers-devel libtorrent-rasterbar2_0 pkgconfig(openssl)"

inherit rpm
