SUMMARY = "Qt 6 LabsAnimation library"
DESCRIPTION = "The Qt 6 LabsAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6LabsAnimation6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "86d713015b9523a6591e50ff0a3fb673741e61bd2f5551bcdeaff32bd58ed5708d91985641f5981cb5808f757e155a645e17c28df67c036b61b4daa2199d64c2"

RPROVIDES:${PN} += "libQt6LabsAnimation.so.6()(64bit) libQt6LabsAnimation.so.6(Qt_6)(64bit) libQt6LabsAnimation.so.6(Qt_6.0)(64bit) libQt6LabsAnimation.so.6(Qt_6.1)(64bit) libQt6LabsAnimation.so.6(Qt_6.2)(64bit) libQt6LabsAnimation.so.6(Qt_6.3)(64bit) libQt6LabsAnimation.so.6(Qt_6.4)(64bit) libQt6LabsAnimation.so.6(Qt_6.5)(64bit) libQt6LabsAnimation.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6LabsAnimation6 libQt6LabsAnimation6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
