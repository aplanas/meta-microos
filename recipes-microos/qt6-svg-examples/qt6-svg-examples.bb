SUMMARY = "Examples for the qt6-svg modules"
DESCRIPTION = "Examples for the qt6-svg modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-svg-examples-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "7b2262af01d47dc2769b932c0e2e15098e3e3939995d0b99204bb4f42fc760f0cc9253f2978c85a040e0248e51c299130ef46ba2309171a41249fb8f5ee5ce7c"

RPROVIDES:${PN} += "qt6-svg-examples qt6-svg-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Svg.so.6()(64bit) libQt6Svg.so.6(Qt_6)(64bit) libQt6SvgWidgets.so.6()(64bit) libQt6SvgWidgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
