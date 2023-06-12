SUMMARY = "Qt 6 Location library"
DESCRIPTION = "The Qt 6 Location library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Location6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e4d02ac5ed6a155f990081eb306f8ffea16016ff082bb514d1db1dc562293bebae859dbdc62bc4f6565337b787dd3f6220b83a1f6a27c4c89d9e1e72f1d2a6fd"

RPROVIDES:${PN} += "libQt6Location.so.6()(64bit) libQt6Location.so.6(Qt_6)(64bit) libQt6Location.so.6(Qt_6.0)(64bit) libQt6Location.so.6(Qt_6.1)(64bit) libQt6Location.so.6(Qt_6.2)(64bit) libQt6Location.so.6(Qt_6.3)(64bit) libQt6Location.so.6(Qt_6.4)(64bit) libQt6Location.so.6(Qt_6.5)(64bit) libQt6Location.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Location6 libQt6Location6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Positioning.so.6()(64bit) libQt6Positioning.so.6(Qt_6)(64bit) libQt6Positioning.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6PositioningQuick.so.6()(64bit) libQt6PositioningQuick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6QmlModels.so.6()(64bit) libQt6QmlModels.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6QuickShapes.so.6()(64bit) libQt6QuickShapes.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
