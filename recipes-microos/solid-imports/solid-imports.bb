SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "solid-imports-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "8973bbf5a5853d2a7d44118d3c379849c98796e732bef97d4fb4363cf1683e84419e7b8fd487b29667032802a7c9629d17aaf6fa75d3d6bd18c49787dd7b6b61"

RPROVIDES:${PN} += "libsolidextensionplugin.so()(64bit) qt5qmlimport(org.kde.solid.1) solid-imports solid-imports(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Solid.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
