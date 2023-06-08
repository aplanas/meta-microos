SUMMARY = "Qt 6 QuickControls2 library"
DESCRIPTION = "The Qt 6 QuickControls2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QuickControls2-6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "458e9455ca64e41b8a919748c8a4ef079adc8ff49d6aad17df50af7a13a658574d14315ef84e435e74f771a649802bdbb0b9668f72b30c0eb7680cd4c900a708"

RPROVIDES:${PN} += "libQt6QuickControls2-6 libQt6QuickControls2-6(aarch-64) libQt6QuickControls2.so.6()(64bit) libQt6QuickControls2.so.6(Qt_6)(64bit) libQt6QuickControls2.so.6(Qt_6.0)(64bit) libQt6QuickControls2.so.6(Qt_6.1)(64bit) libQt6QuickControls2.so.6(Qt_6.2)(64bit) libQt6QuickControls2.so.6(Qt_6.3)(64bit) libQt6QuickControls2.so.6(Qt_6.4)(64bit) libQt6QuickControls2.so.6(Qt_6.5)(64bit) libQt6QuickControls2.so.6(Qt_6.5.0_PRIVATE_API)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickTemplates2.so.6()(64bit) libQt6QuickTemplates2.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
