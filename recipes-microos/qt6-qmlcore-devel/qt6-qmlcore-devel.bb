SUMMARY = "Qt 6 QmlCore library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmlcore-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "e4a1998f60581bb682acfd3435739d81955a3bcc36a25f8851241362b2a9a585caa5b95195c700321379240bdf0e57d12cbe044a3fc3a5ecd62951c2f0d22d9e"

RPROVIDES:${PN} += "cmake(Qt6QmlCore) pkgconfig(Qt6QmlCore) qt6-qmlcore-devel qt6-qmlcore-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) libQt6QmlCore6 pkgconfig(Qt6Core) pkgconfig(Qt6Qml)"

inherit rpm
