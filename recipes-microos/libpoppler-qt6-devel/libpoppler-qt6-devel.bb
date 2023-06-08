SUMMARY = "Development files for the Poppler Qt6 wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "libpoppler-qt6-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "9cd890d2feb75dbc5f35ce75f6d952e082d5e7efabd699900f0f3a939d3569cbfb5083f7d8a6a61a6d2537cfebc9820c578cf95e7bb8ad2efdce0e2613560184"

RPROVIDES:${PN} += "libpoppler-qt6-devel libpoppler-qt6-devel(aarch-64) pkgconfig(poppler-qt6)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) cmake(Qt6Gui) cmake(Qt6Widgets) libpoppler-devel libpoppler-qt6-3 pkgconfig(poppler)"

inherit rpm
