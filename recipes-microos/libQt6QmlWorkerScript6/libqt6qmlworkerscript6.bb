SUMMARY = "Qt 6 QmlWorkScript library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QmlWorkerScript6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "fa8b7bced7dd23f1d5ff42848d7325445fb9446e2f9bdd640c1f2abfe2b2a3b35907f523d08014d5879269a85c8945b6be7b2b52f9d85ebc04faa317c74bb23e"

RPROVIDES:${PN} += "libQt6QmlWorkerScript.so.6()(64bit) libQt6QmlWorkerScript.so.6(Qt_6)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.0)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.1)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.2)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.3)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.4)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.5)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QmlWorkerScript6 libQt6QmlWorkerScript6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
