SUMMARY = "QML imports for the Qt 5 Sensors library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5Sensors5-imports-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "e5cc8a38906b129f4afe079610b3ba6c7973a0d2184fbfa05716653400ad154e748fc6304043bd194dfeb55802ce74915f403474d5bfe08cb1d9ebcc8895c7f4"

RPROVIDES:${PN} += "libQt5Sensors5-imports libQt5Sensors5-imports(aarch-64) libdeclarative_sensors.so()(64bit) qt5qmlimport(QtSensors.5)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Sensors.so.5()(64bit) libQt5Sensors.so.5(Qt_5)(64bit) libQtQuick5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
