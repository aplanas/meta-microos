SUMMARY = "Qt 6 QuickWidgets library"
DESCRIPTION = "The Qt 6 QuickWidgets library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QuickWidgets6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "2a7c5caa08c0beb2532db5484c50c958b65dd7b0db639074c48b1205706ba65769c11f91edca152764bff5a8ad7ba3496470d8f2603fbdc0c2b37409fff06900"

RPROVIDES:${PN} += "libQt6QuickWidgets.so.6()(64bit) libQt6QuickWidgets.so.6(Qt_6)(64bit) libQt6QuickWidgets.so.6(Qt_6.0)(64bit) libQt6QuickWidgets.so.6(Qt_6.1)(64bit) libQt6QuickWidgets.so.6(Qt_6.2)(64bit) libQt6QuickWidgets.so.6(Qt_6.3)(64bit) libQt6QuickWidgets.so.6(Qt_6.4)(64bit) libQt6QuickWidgets.so.6(Qt_6.5)(64bit) libQt6QuickWidgets.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickWidgets6 libQt6QuickWidgets6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
