SUMMARY = "Examples for the qt6-tools modules"
DESCRIPTION = "Examples for the qt6-tools modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-tools-examples-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ccca261891dbfd78de00cba1eb6fbf78f8998e34038cd34c114c01bd875adb6dddc657b1eabed68d46f6f6670f7719e955ba814e3dc9817c066a1d7d5b0262d1"

RPROVIDES:${PN} += "qt6-tools-examples qt6-tools-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Help.so.6()(64bit) libQt6Help.so.6(Qt_6)(64bit) libQt6UiTools.so.6()(64bit) libQt6UiTools.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
