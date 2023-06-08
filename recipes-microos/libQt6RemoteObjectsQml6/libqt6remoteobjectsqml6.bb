SUMMARY = "Qt 6 RemoteObjectsQml library"
DESCRIPTION = "The Qt 6 RemoteObjectsQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6RemoteObjectsQml6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "8c8036bda855a82e2a39297d0499d5a2096dd09bdf1c5b6ebf2232f14529943b67832bb8a3474c4d3716a4a678e55c069bc11d9faa7a6a53a18f86c5dbc34479"

RPROVIDES:${PN} += "libQt6RemoteObjectsQml.so.6()(64bit) libQt6RemoteObjectsQml.so.6(Qt_6)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.0)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.1)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.2)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.3)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.4)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.5)(64bit) libQt6RemoteObjectsQml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6RemoteObjectsQml6 libQt6RemoteObjectsQml6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6RemoteObjects.so.6()(64bit) libQt6RemoteObjects.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
