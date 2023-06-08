SUMMARY = "Qt 6 QuickLayouts library"
DESCRIPTION = "The Qt 6 QuickLayouts library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QuickLayouts6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "1206048cd2534e69d402a608737551f45f7cd8bc6ec4a1c1cc567332946a2af886c36cd6084f7d0c2343bd7518f4daa21cc1dd0a463173736e3b6d0e0be55836"

RPROVIDES:${PN} += "libQt6QuickLayouts.so.6()(64bit) libQt6QuickLayouts.so.6(Qt_6)(64bit) libQt6QuickLayouts.so.6(Qt_6.0)(64bit) libQt6QuickLayouts.so.6(Qt_6.1)(64bit) libQt6QuickLayouts.so.6(Qt_6.2)(64bit) libQt6QuickLayouts.so.6(Qt_6.3)(64bit) libQt6QuickLayouts.so.6(Qt_6.4)(64bit) libQt6QuickLayouts.so.6(Qt_6.5)(64bit) libQt6QuickLayouts.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickLayouts6 libQt6QuickLayouts6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
