SUMMARY = "Development files for libdxfrw"
DESCRIPTION = "This package includes development files for libdxfrw."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0~rc1+git.20220905"

RPM_NAME = "libdxfrw-devel-1.1.0~rc1+git.20220905-1.3.aarch64.rpm"
RPM_HASH = "399617bcf3cc60351c7f64dc10e5f00352d5502e33c228cfaa7a86cd396cf10df167d9317f58c520f682362b4fc69d3e067d5ddc5f92e707d3999ba79696f716"

RPROVIDES:${PN} += "cmake(libdxfrw) libdxfrw-devel libdxfrw-devel(aarch-64) pkgconfig(libdxfrw)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdxfrw1"

inherit rpm
