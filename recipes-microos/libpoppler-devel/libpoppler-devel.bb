SUMMARY = "Development files for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.05.0"

RPM_NAME = "libpoppler-devel-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "452709dfa6b983db01c010a6b8ff09d55e32547d6141dfc95083985469b2638089689ffb91d7a9909a70ad71e05088bdf4fc783bb5feb007768edce8800138a7"

RPROVIDES:${PN} += "libpoppler-devel libpoppler-devel(aarch-64) pkgconfig(poppler) pkgconfig(poppler-cpp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libboost_headers-devel libpoppler-cpp0 libpoppler128 libstdc++-devel"

inherit rpm
