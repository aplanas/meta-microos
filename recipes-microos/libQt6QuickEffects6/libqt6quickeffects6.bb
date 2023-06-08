SUMMARY = "Qt 6 QuickEffects library"
DESCRIPTION = "The Qt 6 QuickEffects library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QuickEffects6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "7e0f23c3e19d3054c2b0d3c01085f367cb56addd9391800967f78be41af509633c2c8dcc0e0f6f857c8873c0d7a45d857b15fe4bc08b60e113e75a49ae63dc94"

RPROVIDES:${PN} += "libQt6QuickEffects.so.6()(64bit) libQt6QuickEffects.so.6(Qt_6)(64bit) libQt6QuickEffects.so.6(Qt_6.0)(64bit) libQt6QuickEffects.so.6(Qt_6.1)(64bit) libQt6QuickEffects.so.6(Qt_6.2)(64bit) libQt6QuickEffects.so.6(Qt_6.3)(64bit) libQt6QuickEffects.so.6(Qt_6.4)(64bit) libQt6QuickEffects.so.6(Qt_6.5)(64bit) libQt6QuickEffects.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickEffects6 libQt6QuickEffects6(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
