SUMMARY = "Qt 6 RemoteObjectsQml library"
DESCRIPTION = "The Qt 6 RemoteObjectsQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6RemoteObjectsQml6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a54d49e656ceafe30424b353b9bdbbafd67b666c1ea2269a008ea60cb5182b31a22837ffd0aaaa518df3fbd87346076d7a291a3f9a5ee4d0371bc34b057aa494"

RPROVIDES:${PN} += "libQt6RemoteObjectsQml.so.6()(64bit) libQt6RemoteObjectsQml.so.6(Qt_6)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.0)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.1)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.2)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.3)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.4)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.5)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6RemoteObjectsQml6 libQt6RemoteObjectsQml6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6RemoteObjects.so.6()(64bit) libQt6RemoteObjects.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
