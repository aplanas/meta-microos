SUMMARY = "Qt 6 LabsQmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsQmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-labsqmlmodels-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "6569d57122ebb19d69e804b9afdc2ca6838b8e29167370e7ac4891f249fcf1b2248d0351aaf0964d65fddd845a7a00a16f6bb55fedcdc515803f4cb21efc6191"

RPROVIDES:${PN} += "cmake(Qt6LabsQmlModels) pkgconfig(Qt6LabsQmlModels) qt6-labsqmlmodels-devel qt6-labsqmlmodels-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt6LabsQmlModels6 pkgconfig(Qt6Qml) pkgconfig(Qt6QmlModels) qt6-qml-private-devel qt6-qmlmodels-private-devel"

inherit rpm
