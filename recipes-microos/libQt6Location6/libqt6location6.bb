SUMMARY = "Qt 6 Location library"
DESCRIPTION = "The Qt 6 Location library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Location6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "15c5ac17c9e54de2d0d64091ad41cd0daddf1a2814cbaa52a4bcfea55bdb7c65486b951945ac1c30a4e5e6b3d5a027618615a7ea54e604a136f9dbdf807a4e09"

RPROVIDES:${PN} += "libQt6Location.so.6()(64bit) libQt6Location.so.6(Qt_6)(64bit) libQt6Location.so.6(Qt_6.0)(64bit) libQt6Location.so.6(Qt_6.1)(64bit) libQt6Location.so.6(Qt_6.2)(64bit) libQt6Location.so.6(Qt_6.3)(64bit) libQt6Location.so.6(Qt_6.4)(64bit) libQt6Location.so.6(Qt_6.5)(64bit) libQt6Location.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Location6 libQt6Location6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Positioning.so.6()(64bit) libQt6Positioning.so.6(Qt_6)(64bit) libQt6Positioning.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6PositioningQuick.so.6()(64bit) libQt6PositioningQuick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6QmlModels.so.6()(64bit) libQt6QmlModels.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickShapes.so.6()(64bit) libQt6QuickShapes.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
