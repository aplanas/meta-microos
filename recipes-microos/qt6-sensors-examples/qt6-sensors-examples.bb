SUMMARY = "Examples for the qt6-sensors modules"
DESCRIPTION = "Examples for the qt6-sensors modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-sensors-examples-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "a003593a671d3c762f60b953d0d17754841ec176f87d9f995e8b520d6301f7c582e58093ed600767d0014b284c2c502d282105921bdb9ec1b8b27f26b611d4bf"

RPROVIDES:${PN} += "qt6-sensors-examples qt6-sensors-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
