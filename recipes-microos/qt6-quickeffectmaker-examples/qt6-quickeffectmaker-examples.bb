SUMMARY = "Examples for the qt6-quickeffectmaker modules"
DESCRIPTION = "Examples for the qt6-quickeffectmaker modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-quickeffectmaker-examples-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "cfd5be51ad6a167061eb0b72519d8eb19cdee9d96cb65b81537e249b7536e19de73d5adcfc680920f38e96d12c762c2600d4a416c7b86fe965ca73079c882336"

RPROVIDES:${PN} += "qt6-quickeffectmaker-examples qt6-quickeffectmaker-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
