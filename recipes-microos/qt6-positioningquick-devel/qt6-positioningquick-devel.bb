SUMMARY = "Qt 6 PositioningQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 PositioningQuick library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-positioningquick-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "9520a8dd84cf99bd002db613eebc35db130bca70b473e0b99ebbe42dc974d40e29441d0d8e9d0b65829d3a51fd7ad364d8feeefd9a90b6c220aa5b79cd4fa12a"

RPROVIDES:${PN} += "cmake(Qt6PositioningQuick) pkgconfig(Qt6PositioningQuick) qt6-positioningquick-devel qt6-positioningquick-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) cmake(Qt6Quick) libQt6PositioningQuick6 pkgconfig(Qt6Core) pkgconfig(Qt6Positioning) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick)"

inherit rpm
