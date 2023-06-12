SUMMARY = "Qt 6 Location library - Development files"
DESCRIPTION = "Development files for the Qt 6 Location library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "adb835ceff2d481731ac053463ff21f24d71bdb85b19a07f5af3c5a130f2360d78406d361cac9ea3c1b561ec89dcfcedfbd39ebcabac5ab938b8fe6565af555d"

RPROVIDES:${PN} += "cmake(Qt6Location) pkgconfig(Qt6Location) qt6-location-devel qt6-location-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Network) cmake(Qt6Positioning) cmake(Qt6PositioningQuick) cmake(Qt6QuickShapesPrivate) libQt6Location6 pkgconfig(Qt6Core) pkgconfig(Qt6Positioning) pkgconfig(Qt6PositioningQuick) qt6-quick-private-devel"

inherit rpm
