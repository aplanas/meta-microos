SUMMARY = "Qt 6 QmlXmlListModel library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlXmlListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmlxmllistmodel-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "f6455ec6eda20793ef9a80bf046e1ff41669a1cbbdac17cf2e211ea8ea458b95d83d13ac0f444a61c54d7283834b25d407c8c637ea8c5e538709a6ec48b2c8ee"

RPROVIDES:${PN} += "cmake(Qt6QmlXmlListModel) pkgconfig(Qt6QmlXmlListModel) qt6-qmlxmllistmodel-devel qt6-qmlxmllistmodel-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) libQt6QmlXmlListModel6 pkgconfig(Qt6Core) pkgconfig(Qt6Qml)"

inherit rpm
