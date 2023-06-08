SUMMARY = "Qt 6 QuickShapes library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickshapes-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "b35f3a2d0ccb2c0eeda25ba4e8268d7122a9a5f382615f64bd730c94f7c8638944028dc5474cbf8f70842838ece56f38d7d84de735cfee58bf6ef0dccad51d00"

RPROVIDES:${PN} += "cmake(Qt6QuickShapesPrivate) qt6-quickshapes-devel qt6-quickshapes-private-devel qt6-quickshapes-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Qml) libQt6QuickShapes6 qt6-gui-private-devel qt6-quick-private-devel"

inherit rpm
