SUMMARY = "Development files for libtorrent, a C++ BitTorrent library"
DESCRIPTION = "LibTorrent is a BitTorrent library written in C++. It transfers \
directly from file pages to the network stack, and achieves 3x higher \
seed speeds than the official client on high-bandwidth links."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "0.13.8"

RPM_NAME = "libtorrent-devel-0.13.8-2.12.aarch64.rpm"
RPM_HASH = "84f251c2669ec050ff1767c7ae8ba1a06b38cfffa599b1c6d79d82152738d4b7ad25895f381d5471956e4d508890c3736d46e180d8aeeea207ce07e4999cdbca"

RPROVIDES:${PN} += "libtorrent-devel libtorrent-devel(aarch-64) pkgconfig(libtorrent)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtorrent21"

inherit rpm
