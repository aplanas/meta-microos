SUMMARY = "Development files for the Qt5 Location Library"
DESCRIPTION = "The Qt Location API facilitates creating mapping solutions using \
the data available from some contemporary location services. \
 \
This subpackage contains the header files for developing \
applications that want to make use of the Qt Location libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtlocation-devel-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "45367134521ce1cf67d5e17d2dc4553932e2718f6289ccad8305b666af4a5d01cefdf40d5d60e45d413de06afffb6e2f89b64d9f5ef7ee56a734728c46b7eb01"

RPROVIDES:${PN} += "cmake(Qt5Location) cmake(Qt5Positioning) cmake(Qt5PositioningQuick) libqt5-qtlocation-devel libqt5-qtlocation-devel(aarch-64) pkgconfig(Qt5Location) pkgconfig(Qt5Positioning) pkgconfig(Qt5PositioningQuick)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Location5 libQt5Positioning5 libQt5PositioningQuick5 pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5Network) pkgconfig(Qt5Positioning) pkgconfig(Qt5PositioningQuick) pkgconfig(Qt5Qml) pkgconfig(Qt5Quick)"

inherit rpm
