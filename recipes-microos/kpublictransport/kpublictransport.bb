SUMMARY = "QML imports for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries. QML imports."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kpublictransport-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "fa3b9736e6dfdb9571392a40f9da15acfe92750f634d5414aae51876774b416ca938131d46880ea360584284c00f2b788dcc77decf50a5dfd289e1f06c92ee1b"

RPROVIDES:${PN} += "kpublictransport kpublictransport(aarch-64) libkpublictransportonboardqmlplugin.so()(64bit) libkpublictransportqmlplugin.so()(64bit) libkpublictransportquickplugin.so()(64bit) qt5qmlimport(org.kde.kpublictransport.1) qt5qmlimport(org.kde.kpublictransport.onboard.1) qt5qmlimport(org.kde.kpublictransport.ui.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKPublicTransport.so.1()(64bit) libKPublicTransport1 libKPublicTransportOnboard.so.1()(64bit) libKPublicTransportOnboard1 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(org.kde.kpublictransport.1) qt5qmlimport(org.kde.kpublictransport.ui.1)"

inherit rpm
