SUMMARY = "Qt 6 LabsQmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsQmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsqmlmodels-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e05c07a8ebcf2f75a61a8dcf52b4c7b521dc6f856ef76770610ca8b68c9992d8522cbe6ccc3efcefd3f3d361f1d2ec416a6087fe1ba9bca0a1655c47a05df617"

RPROVIDES:${PN} += "cmake(Qt6LabsQmlModels) pkgconfig(Qt6LabsQmlModels) qt6-labsqmlmodels-devel qt6-labsqmlmodels-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt6LabsQmlModels6 pkgconfig(Qt6Qml) pkgconfig(Qt6QmlModels) qt6-qml-private-devel qt6-qmlmodels-private-devel"

inherit rpm
