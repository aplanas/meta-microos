SUMMARY = "Qt 6 QuickControls2Impl library"
DESCRIPTION = "The Qt 6 QuickControls2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QuickControls2Impl6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "dfe908153f2b94ceeac7bf0b958c3337e152cd322d9c0aa5edc251b75d320908b0f8af37a0e0eb9f9a6be1099720a30d9eaf7313b0a63c87aae5897655f0f3bc"

RPROVIDES:${PN} += "libQt6QuickControls2Impl.so.6()(64bit) libQt6QuickControls2Impl.so.6(Qt_6)(64bit) libQt6QuickControls2Impl.so.6(Qt_6.0)(64bit) libQt6QuickControls2Impl.so.6(Qt_6.1)(64bit) libQt6QuickControls2Impl.so.6(Qt_6.2)(64bit) libQt6QuickControls2Impl.so.6(Qt_6.3)(64bit) libQt6QuickControls2Impl.so.6(Qt_6.4)(64bit) libQt6QuickControls2Impl.so.6(Qt_6.5)(64bit) libQt6QuickControls2Impl.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickControls2Impl6 libQt6QuickControls2Impl6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickTemplates2.so.6()(64bit) libQt6QuickTemplates2.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
