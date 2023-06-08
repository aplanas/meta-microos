SUMMARY = "Qt 6 Location library - Development files"
DESCRIPTION = "Development files for the Qt 6 Location library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-location-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "1023add201448568675a0c1f7a7f3a2e83524a317c59b2ad954b72997b3cea8d7ff64903995bc47f2e2071b3b4efbaf58ccb261b49dfa87ce495db03de9d9853"

RPROVIDES:${PN} += "cmake(Qt6Location) pkgconfig(Qt6Location) qt6-location-devel qt6-location-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Network) cmake(Qt6Positioning) cmake(Qt6PositioningQuick) cmake(Qt6QuickShapesPrivate) libQt6Location6 pkgconfig(Qt6Core) pkgconfig(Qt6Positioning) pkgconfig(Qt6PositioningQuick) qt6-quick-private-devel"

inherit rpm
