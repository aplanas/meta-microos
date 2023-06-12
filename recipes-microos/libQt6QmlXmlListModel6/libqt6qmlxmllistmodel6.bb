SUMMARY = "Qt 6 QmlXmlListModel library"
DESCRIPTION = "The Qt 6 QmlXmlListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlXmlListModel6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "b16fd78e1f3a31c66e22fb39686d3543f33eb9e371b69dd57709a1d01fb7a12eebf8b131199d5d5b081d0497917b80b88b30f73536d5557faf9242bdede9c9fc"

RPROVIDES:${PN} += "libQt6QmlXmlListModel.so.6()(64bit) \
libQt6QmlXmlListModel.so.6(Qt_6)(64bit) \
libQt6QmlXmlListModel.so.6(Qt_6.0)(64bit) \
libQt6QmlXmlListModel.so.6(Qt_6.1)(64bit) \
libQt6QmlXmlListModel.so.6(Qt_6.2)(64bit) \
libQt6QmlXmlListModel.so.6(Qt_6.3)(64bit) \
libQt6QmlXmlListModel.so.6(Qt_6.4)(64bit) \
libQt6QmlXmlListModel.so.6(Qt_6.5)(64bit) \
libQt6QmlXmlListModel.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6QmlXmlListModel6 \
libQt6QmlXmlListModel6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
