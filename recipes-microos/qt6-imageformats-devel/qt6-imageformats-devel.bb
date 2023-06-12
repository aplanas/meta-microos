SUMMARY = "Qt 6 ImageFormats - Development files"
DESCRIPTION = "Development files for the Qt 6 ImageFormats plugins."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-imageformats-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1befaafac571e950f16fb4ad90e590c906a29078a518ac3b53a61ed7f94197a9ac68be6af379f3a2af1828482db06428800e43a62b70934346f407694dfea9b3"

RPROVIDES:${PN} += "cmake(Qt6QICNSPlugin) cmake(Qt6QMngPlugin) cmake(Qt6QTgaPlugin) cmake(Qt6QTiffPlugin) cmake(Qt6QWbmpPlugin) cmake(Qt6QWebpPlugin) qt6-imageformats-devel qt6-imageformats-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Gui) libtiff-devel pkgconfig(libmng) pkgconfig(libwebp) qt6-imageformats"

inherit rpm
