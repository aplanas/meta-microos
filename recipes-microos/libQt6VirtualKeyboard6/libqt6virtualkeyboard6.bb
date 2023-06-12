SUMMARY = "Qt 6 VirtualKeyboard library"
DESCRIPTION = "The Qt SVG module provides functionality for displaying SVG images \
as a widget, and to create SVG files using drawing commands."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6VirtualKeyboard6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "cf08cee62cda5549074e6e91bced3190cd34d282bb77250bf51a3b010f1cb8f44ff452c5c21a402f92149cff6e8157b4bf9ecb2e177c2c571085d2cd40e12a62"

RPROVIDES:${PN} += "libQt6VirtualKeyboard.so.6()(64bit) libQt6VirtualKeyboard.so.6(Qt_6)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.0)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.1)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.2)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.3)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.4)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.5)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6VirtualKeyboard6 libQt6VirtualKeyboard6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
