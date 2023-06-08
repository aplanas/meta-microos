SUMMARY = "Examples for the qt6-httpserver modules"
DESCRIPTION = "Examples for the qt6-httpserver modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-httpserver-examples-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "72d77acab879b1f116913c316fe97343bb8cfc5e48f2784a22174e88703ef19c480ff254906dfd0caba60b6cabbe7cce3a33d87add881eee2cc189e332734568"

RPROVIDES:${PN} += "qt6-httpserver-examples qt6-httpserver-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6HttpServer.so.6()(64bit) libQt6HttpServer.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
