SUMMARY = "Qt 6 LabsSettings library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsSettings library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-labssettings-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "0d9c60694683d63151a8febf6b142e2d70f2ea9e140572300d4a267a888e28104c58a1224cd2f93d105cbc07e1c56a85689e0b8680b39247726fa3c6c81a488c"

RPROVIDES:${PN} += "cmake(Qt6LabsSettings) pkgconfig(Qt6LabsSettings) qt6-labssettings-devel qt6-labssettings-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) cmake(Qt6Qml) libQt6LabsSettings6 pkgconfig(Qt6Core) pkgconfig(Qt6Qml)"

inherit rpm
