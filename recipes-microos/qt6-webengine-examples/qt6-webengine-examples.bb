SUMMARY = "Examples for the qt6-webengine modules"
DESCRIPTION = "Examples for the qt6-webengine modules."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-webengine-examples-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "2a5a9d1e0f7e56d2d6c0c5c672ca786fbc8940b7655168f9d0b0cd91d9f8c2b6fac6c16166f798ba7236e03d143179e86d20b9adc82c4b880950f91027587a67"

RPROVIDES:${PN} += "qt6-webengine-examples qt6-webengine-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Pdf.so.6()(64bit) libQt6Pdf.so.6(Qt_6)(64bit) libQt6PdfWidgets.so.6()(64bit) libQt6PdfWidgets.so.6(Qt_6)(64bit) libQt6PrintSupport.so.6()(64bit) libQt6PrintSupport.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6QuickControls2.so.6()(64bit) libQt6QuickControls2.so.6(Qt_6)(64bit) libQt6WebChannel.so.6()(64bit) libQt6WebChannel.so.6(Qt_6)(64bit) libQt6WebEngineCore.so.6()(64bit) libQt6WebEngineCore.so.6(Qt_6)(64bit) libQt6WebEngineQuick.so.6()(64bit) libQt6WebEngineQuick.so.6(Qt_6)(64bit) libQt6WebEngineWidgets.so.6()(64bit) libQt6WebEngineWidgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
