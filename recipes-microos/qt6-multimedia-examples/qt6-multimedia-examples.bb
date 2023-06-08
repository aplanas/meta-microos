SUMMARY = "Examples for the qt6-multimedia modules"
DESCRIPTION = "Examples for the qt6-multimedia modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-multimedia-examples-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "f1f679fcfcd1ed562d77b654708607fcd187a68c7d2a6f387d3320b1ad7a5ab02e76edd0636ded0f8ee0c896ee8495806c551d3b747c54ebf991b012a77f1e0a"

RPROVIDES:${PN} += "qt6-multimedia-examples qt6-multimedia-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Multimedia.so.6()(64bit) libQt6Multimedia.so.6(Qt_6)(64bit) libQt6MultimediaWidgets.so.6()(64bit) libQt6MultimediaWidgets.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6SpatialAudio.so.6()(64bit) libQt6SpatialAudio.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
