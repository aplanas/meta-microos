SUMMARY = "Qt 6 QuickLayouts library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickLayouts library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quicklayouts-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "4a87ec011ddfccb37569c65ef85a774bcd9f25b2222ea778e3a94ee5b024392af3567339691c3db4d7ee65d971b15240031c2092830df27b0d929be0bcc6c0ab"

RPROVIDES:${PN} += "cmake(Qt6QuickLayouts) pkgconfig(Qt6QuickLayouts) qt6-quicklayouts-devel qt6-quicklayouts-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) libQt6QuickLayouts6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) qt6-gui-private-devel qt6-quick-private-devel"

inherit rpm
