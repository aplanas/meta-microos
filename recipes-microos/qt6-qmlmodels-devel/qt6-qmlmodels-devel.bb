SUMMARY = "Qt 6 QmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmlmodels-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "fbaae6d57745277c082598c62f56e7fe533eab0af8706fb15d2db9bd2186e29e975b74595d82ef5eec1d09d33c471cdca125dee55dec0e7f9ad2f8ff07dff48d"

RPROVIDES:${PN} += "cmake(Qt6QmlModels) pkgconfig(Qt6QmlModels) qt6-qmlmodels-devel qt6-qmlmodels-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) cmake(Qt6Qml) libQt6QmlModels6 pkgconfig(Qt6Core) pkgconfig(Qt6Qml)"

inherit rpm
