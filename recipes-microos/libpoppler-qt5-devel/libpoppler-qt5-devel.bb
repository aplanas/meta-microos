SUMMARY = "Development files for the Poppler Qt5 wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "libpoppler-qt5-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a41e3e2f36b3bfeeec7853048417073d2e48fbdf664b4552af0a63d285ee2b299495d3a5c42ad4bc70003a9671a2f803daee59dd86301f0c61867a04a85d54d7"

RPROVIDES:${PN} += "libpoppler-qt5-devel libpoppler-qt5-devel(aarch-64) pkgconfig(poppler-qt5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpoppler-devel libpoppler-qt5-1 pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5Widgets) pkgconfig(Qt5Xml) pkgconfig(poppler)"

inherit rpm
