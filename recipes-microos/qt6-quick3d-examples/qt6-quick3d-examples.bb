SUMMARY = "Examples for the qt6-quick3d modules"
DESCRIPTION = "Examples for the qt6-quick3d modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3d-examples-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "71e93bced2a26c6bd90cc158a479853b25d2439266609fd69b583836f9a443a02788136dc00f54116a40a440103e3d32bad1cc1b0fdad63c9385e23a675343da"

RPROVIDES:${PN} += "qt6-quick3d-examples qt6-quick3d-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick3D.so.6()(64bit) libQt6Quick3D.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
