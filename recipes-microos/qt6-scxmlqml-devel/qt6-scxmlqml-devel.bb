SUMMARY = "Qt 6 ScxmlQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 ScxmlQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-scxmlqml-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "eca247b41f3a83415994a14c5e4bc9aff35cfa2a8ba4e5fd947e1da44ad9bdab2c4f78f37b87edebe21699fa5a0d2bf7743218cd2f6808512b3632e7e7bc2888"

RPROVIDES:${PN} += "cmake(Qt6ScxmlQml) pkgconfig(Qt6ScxmlQml) qt6-scxmlqml-devel qt6-scxmlqml-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) cmake(Qt6Scxml) libQt6ScxmlQml6 pkgconfig(Qt6Core) pkgconfig(Qt6Qml) pkgconfig(Qt6Scxml)"

inherit rpm
