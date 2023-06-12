SUMMARY = "Qt 6 QmlWorkScript library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlWorkerScript6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "0a1ff25ee70e2833937d18e48ab5109d02924fabd14e997b9fa632a28c52862667d570d164310c22866bd5af8ec5cad1e31da59b15e5d55e2f936d36aaf4291e"

RPROVIDES:${PN} += "libQt6QmlWorkerScript.so.6()(64bit) libQt6QmlWorkerScript.so.6(Qt_6)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.0)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.1)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.2)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.3)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.4)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.5)(64bit) libQt6QmlWorkerScript.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6QmlWorkerScript6 libQt6QmlWorkerScript6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
