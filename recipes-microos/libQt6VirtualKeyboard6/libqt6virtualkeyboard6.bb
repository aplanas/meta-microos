SUMMARY = "Qt 6 VirtualKeyboard library"
DESCRIPTION = "The Qt SVG module provides functionality for displaying SVG images \
as a widget, and to create SVG files using drawing commands."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6VirtualKeyboard6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "7da5024a83031d937d8d40ac688ec6748cd110297e7a74baa5026dc84986a06eaf82d4085f603ad96bfed5ef087f5f1f274b5a76a3b166d6b71e4c2bfaad4349"

RPROVIDES:${PN} += "libQt6VirtualKeyboard.so.6()(64bit) libQt6VirtualKeyboard.so.6(Qt_6)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.0)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.1)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.2)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.3)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.4)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.5)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6VirtualKeyboard6 libQt6VirtualKeyboard6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
