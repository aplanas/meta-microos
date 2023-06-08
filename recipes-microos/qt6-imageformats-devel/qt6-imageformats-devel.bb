SUMMARY = "Qt 6 ImageFormats - Development files"
DESCRIPTION = "Development files for the Qt 6 ImageFormats plugins."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-imageformats-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "f369d4cb36170717289ad612d91056cd7a148a21ad863dd64f287d9c4eccf46216501b23d60cd03a5b6a6872f141a06f8191e7157ff754f21990f7ec51616247"

RPROVIDES:${PN} += "cmake(Qt6QICNSPlugin) cmake(Qt6QMngPlugin) cmake(Qt6QTgaPlugin) cmake(Qt6QTiffPlugin) cmake(Qt6QWbmpPlugin) cmake(Qt6QWebpPlugin) qt6-imageformats-devel qt6-imageformats-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Gui) libtiff-devel pkgconfig(libmng) pkgconfig(libwebp) qt6-imageformats"

inherit rpm
