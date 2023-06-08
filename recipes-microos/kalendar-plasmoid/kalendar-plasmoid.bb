SUMMARY = "Plasma widget to view address book contacts"
DESCRIPTION = "This package provides a Plasma widget to view address book contacts."
LICENSE = "GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "kalendar-plasmoid-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "bdb6d40b91f596b701c4287907fb002a42c052f6784dac5f578ac7778e1045a1e88f7c4bf5e1f84c67f911576b760f54e2aecd2140ef60c0f922644cf6dacad8"

RPROVIDES:${PN} += "kalendar-plasmoid kalendar-plasmoid(aarch-64) metainfo() metainfo(org.kde.kalendar.contact.appdata.xml)"
RDEPENDS:${PN} += "kalendar qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtQml.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kalendar.contact.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.kitemmodels.1) qt5qmlimport(org.kde.kquickcontrolsaddons.2) qt5qmlimport(org.kde.plasma.components.3) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.extras.2) qt5qmlimport(org.kde.plasma.plasmoid.2) qt5qmlimport(org.kde.prison.1)"

inherit rpm
