SUMMARY = "Qt 6 Qml library - Development files"
DESCRIPTION = "Development files for the Qt 6 Qml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qml-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "b5573dd5e8b91032debe246d93ab6f2b77d8c7498969f67030580e9053e32d465a702a08f08dfbd86f9e8f01597e7f55e9b02a99dc71ba2eccf0c3b5330bc3f4"

RPROVIDES:${PN} += "cmake(Qt6Qml) cmake(Qt6QmlImportScanner) cmake(Qt6QmlIntegration) cmake(Qt6QmlTools) pkgconfig(Qt6Qml) pkgconfig(Qt6QmlIntegration) qt6-qml-devel qt6-qml-devel(aarch-64) qt6-qmldevtools-devel-static"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Network) libQt6Qml6 pkgconfig(Qt6Core) pkgconfig(Qt6Network) pkgconfig(Qt6QmlIntegration) qt6-declarative-tools"

inherit rpm
