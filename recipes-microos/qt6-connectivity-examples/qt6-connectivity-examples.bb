SUMMARY = "Examples for the qt6-connectivity modules"
DESCRIPTION = "Examples for the qt6-connectivity modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-connectivity-examples-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "57a090931b572aa681c130e2cc5318561ecea59bfc9cd004f99d1ca8289b9fbd4ab7c18914a9f26728b658783362579e7d53425ff5b22f0fbe73ec7ee684d038"

RPROVIDES:${PN} += "qt6-connectivity-examples qt6-connectivity-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Bluetooth.so.6()(64bit) libQt6Bluetooth.so.6(Qt_6)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Nfc.so.6()(64bit) libQt6Nfc.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
