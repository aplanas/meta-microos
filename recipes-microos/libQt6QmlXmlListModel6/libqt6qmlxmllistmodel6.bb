SUMMARY = "Qt 6 QmlXmlListModel library"
DESCRIPTION = "The Qt 6 QmlXmlListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QmlXmlListModel6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "8be6679c925cb3f3cd07cbbacc12a2140dd4114ac25048a4ccc6640ebc2eb251c44c6df0692890883293299923e1855c62e99a571bba8ecfb16cb0a8ba8a5f78"

RPROVIDES:${PN} += "libQt6QmlXmlListModel.so.6()(64bit) libQt6QmlXmlListModel.so.6(Qt_6)(64bit) libQt6QmlXmlListModel.so.6(Qt_6.0)(64bit) libQt6QmlXmlListModel.so.6(Qt_6.1)(64bit) libQt6QmlXmlListModel.so.6(Qt_6.2)(64bit) libQt6QmlXmlListModel.so.6(Qt_6.3)(64bit) libQt6QmlXmlListModel.so.6(Qt_6.4)(64bit) libQt6QmlXmlListModel.so.6(Qt_6.5)(64bit) libQt6QmlXmlListModel.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QmlXmlListModel6 libQt6QmlXmlListModel6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
