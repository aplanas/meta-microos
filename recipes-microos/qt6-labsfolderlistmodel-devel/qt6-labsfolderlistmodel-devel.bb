SUMMARY = "Qt 6 LabsFolderListModel library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsFolderListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-labsfolderlistmodel-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "d996c6796e18b15257c584a4694acad9f82e2665be654bb095482e9b510062ee0945b0b7544aefaa4d669ff9d7f85debf32113325ebdeb3915abf09dd7054825"

RPROVIDES:${PN} += "cmake(Qt6LabsFolderListModel) pkgconfig(Qt6LabsFolderListModel) qt6-labsfolderlistmodel-devel qt6-labsfolderlistmodel-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt6LabsFolderListModel6 pkgconfig(Qt6Core) pkgconfig(Qt6Qml) pkgconfig(Qt6QmlModels) qt6-core-private-devel qt6-qml-private-devel"

inherit rpm
