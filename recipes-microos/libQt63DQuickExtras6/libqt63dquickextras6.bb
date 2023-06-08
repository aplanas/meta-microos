SUMMARY = "Qt 6 3DQuickExtras library"
DESCRIPTION = "The Qt 6 3DQuickExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt63DQuickExtras6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "40d50de9da9d12beae5d25017053cb348d5ceb3508ac4ec0eeaa9a4be28076064de988a8723af85465034e04d136f96c1ddfffd24e61516fcd3cfc308b33ba20"

RPROVIDES:${PN} += "libQt63DQuickExtras.so.6()(64bit) libQt63DQuickExtras.so.6(Qt_6)(64bit) libQt63DQuickExtras.so.6(Qt_6.0)(64bit) libQt63DQuickExtras.so.6(Qt_6.1)(64bit) libQt63DQuickExtras.so.6(Qt_6.2)(64bit) libQt63DQuickExtras.so.6(Qt_6.3)(64bit) libQt63DQuickExtras.so.6(Qt_6.4)(64bit) libQt63DQuickExtras.so.6(Qt_6.5)(64bit) libQt63DQuickExtras.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DQuickExtras6 libQt63DQuickExtras6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DCore.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DExtras.so.6()(64bit) libQt63DExtras.so.6(Qt_6)(64bit) libQt63DInput.so.6()(64bit) libQt63DInput.so.6(Qt_6)(64bit) libQt63DLogic.so.6()(64bit) libQt63DLogic.so.6(Qt_6)(64bit) libQt63DQuick.so.6()(64bit) libQt63DQuick.so.6(Qt_6)(64bit) libQt63DQuick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DRender.so.6()(64bit) libQt63DRender.so.6(Qt_6)(64bit) libQt63DRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
