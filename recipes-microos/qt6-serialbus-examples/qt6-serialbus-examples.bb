SUMMARY = "Examples for the qt6-serialbus modules"
DESCRIPTION = "Examples for the qt6-serialbus modules."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-serialbus-examples-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "763652ceb59ec436fdf04e5af278765245a5d5468a8403f8b831ad528ebe1cc4a3bdf7e6236ed66e05a4685636086bbf0d2ddf321e3cfd645145dee87a2da979"

RPROVIDES:${PN} += "qt6-serialbus-examples qt6-serialbus-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6SerialBus.so.6()(64bit) libQt6SerialBus.so.6(Qt_6)(64bit) libQt6SerialPort.so.6()(64bit) libQt6SerialPort.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
