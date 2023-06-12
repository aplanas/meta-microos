SUMMARY = "Development files for the Poppler Qt6 wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.05.0"

RPM_NAME = "libpoppler-qt6-devel-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "110b7e4acfcd5c48dcb3134cbc10a84745b0e573dc15e5adc8188bbf896f38fd2f3715e225a9f35c4238ffbe7d8d5727d40c9074ba2850e252c36c2d55c8d28e"

RPROVIDES:${PN} += "libpoppler-qt6-devel libpoppler-qt6-devel(aarch-64) pkgconfig(poppler-qt6)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) cmake(Qt6Gui) cmake(Qt6Widgets) libpoppler-devel libpoppler-qt6-3 pkgconfig(poppler)"

inherit rpm
