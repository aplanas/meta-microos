SUMMARY = "Plasma widget to control screen configuration"
DESCRIPTION = "This package provides a Plasma widget to control common screen configuration options."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "kscreen5-plasmoid-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "72c971a2725fa61b1ca6455906e00ea29f0560945a64c6fdfe5f1b95e752818640a503d566504bf502d1af3a9f6601d4255e46ee2f136b7521db914c20a8cf77"

RPROVIDES:${PN} += "kscreen5-plasmoid kscreen5-plasmoid(aarch-64)"
RDEPENDS:${PN} += "kscreen5 qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kquickcontrolsaddons.2) qt5qmlimport(org.kde.plasma.components.3) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.extras.2) qt5qmlimport(org.kde.plasma.plasmoid.2)"

inherit rpm
