SUMMARY = "Qt 6 QmlLocalStorage library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlLocalStorage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmllocalstorage-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "252f2ec66319fc27438f06e53e7560279ab34dfabb102a126a06e411b3178e7577a443c53156613a226c5c2e89b40da368362e01c922327c4fa0a340f2573053"

RPROVIDES:${PN} += "cmake(Qt6QmlLocalStorage) pkgconfig(Qt6QmlLocalStorage) qt6-qmllocalstorage-devel qt6-qmllocalstorage-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Sql) libQt6QmlLocalStorage6 pkgconfig(Qt6Core) pkgconfig(Qt6Qml) pkgconfig(Qt6Sql) qt6-core-private-devel qt6-qml-private-devel"

inherit rpm
