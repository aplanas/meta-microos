SUMMARY = "Qt 6 SensorsQuick library"
DESCRIPTION = "The Qt6 SensorsQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6SensorsQuick6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "664a2d0cbdc745016e8e9a43a86b968e61684a41c9bb869ca75d9f398cf73c40cccfb4ba25e5297f2b92329b4765d519dfcfaaae110ea98280b91b74b03a55f9"

RPROVIDES:${PN} += "libQt6SensorsQuick.so.6()(64bit) libQt6SensorsQuick.so.6(Qt_6)(64bit) libQt6SensorsQuick.so.6(Qt_6.0)(64bit) libQt6SensorsQuick.so.6(Qt_6.1)(64bit) libQt6SensorsQuick.so.6(Qt_6.2)(64bit) libQt6SensorsQuick.so.6(Qt_6.3)(64bit) libQt6SensorsQuick.so.6(Qt_6.4)(64bit) libQt6SensorsQuick.so.6(Qt_6.5)(64bit) libQt6SensorsQuick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6SensorsQuick6 libQt6SensorsQuick6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Sensors.so.6()(64bit) libQt6Sensors.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
