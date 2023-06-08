SUMMARY = "Examples for the qt6-virtualkeyboard modules"
DESCRIPTION = "Examples for the qt6-virtualkeyboard modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-virtualkeyboard-examples-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "aaf02e123313789dc8a7b6bff7fff544e51c9572579ec6dcbfb0dcb71cd6b36751fb3224a55fcf7f14bf8c6607187b4cd1c3199f15aa6eb134b80a574622cfa9"

RPROVIDES:${PN} += "qt6-virtualkeyboard-examples qt6-virtualkeyboard-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
