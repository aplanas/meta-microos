SUMMARY = "Development files for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "libpoppler-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "77d61406224b936bdfb702cf4e10823c7927c2ab346219214fb8ef39b8b25eb9f0291d76f6d9015cd356fc4177a917f176008b966a6761e93582c472be1198d4"

RPROVIDES:${PN} += "libpoppler-devel libpoppler-devel(aarch-64) pkgconfig(poppler) pkgconfig(poppler-cpp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libboost_headers-devel libpoppler-cpp0 libpoppler127 libstdc++-devel"

inherit rpm
