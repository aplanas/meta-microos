SUMMARY = "Qt 6 PositioningQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 PositioningQuick library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioningquick-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a1c01fb87da91494ebbb7324eefbe0f81f949331e1d3c998edcbe83d49691f2cb60ddea26a4afbf57fc0141bffc49991325d0b0fe0796def63ca7213882bcaa4"

RPROVIDES:${PN} += "cmake(Qt6PositioningQuick) pkgconfig(Qt6PositioningQuick) qt6-positioningquick-devel qt6-positioningquick-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) cmake(Qt6Quick) libQt6PositioningQuick6 pkgconfig(Qt6Core) pkgconfig(Qt6Positioning) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick)"

inherit rpm
