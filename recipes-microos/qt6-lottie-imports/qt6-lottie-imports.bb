SUMMARY = "Qt 6 Lottie QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Lottie module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-lottie-imports-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "018e5a3c5eb4892bb6dcd72c9c91a1ce78b3121654769c3dc738100f15fe43f4c1211f3423094457e05b88f4d49512403beffc3329a94977d36c70ed12cb79cc"

RPROVIDES:${PN} += "liblottieqtplugin.so()(64bit) liblottieqtplugin.so(Qt_6)(64bit) liblottieqtplugin.so(Qt_6.0)(64bit) liblottieqtplugin.so(Qt_6.1)(64bit) liblottieqtplugin.so(Qt_6.2)(64bit) liblottieqtplugin.so(Qt_6.3)(64bit) liblottieqtplugin.so(Qt_6.4)(64bit) liblottieqtplugin.so(Qt_6.5)(64bit) liblottieqtplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-lottie-imports qt6-lottie-imports(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Bodymovin.so.6()(64bit) libQt6Bodymovin.so.6(Qt_6)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
