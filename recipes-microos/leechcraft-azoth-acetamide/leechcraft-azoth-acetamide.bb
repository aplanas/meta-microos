SUMMARY = "LeechCraft Azoth IRC Module"
DESCRIPTION = "This package provides an IRC protocol plugin for LeechCraft Azoth. \
 \
Features: \
 * Secure Sockets Layer (SSL) cryptographic protocol. \
 * Channel bookmarks. \
 * Automatic password entry. \
 * Automatic login."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-acetamide-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "8c044ff50dfd2eead8c69d7ff9db7529a66f33cf0f4a28a4341acf8af0bf71d9aa90b629d6042c79bfb4461f9f49237d4cf313f615f531ace91b3fbdf59984b0"

RPROVIDES:${PN} += "application() application(leechcraft-azoth-acetamide-qt5.desktop) leechcraft-azoth-acetamide leechcraft-azoth-acetamide(aarch-64) leechcraft-azoth-protocolplugin libleechcraft_azoth_acetamide.so()(64bit) mimehandler(x-scheme-handler/irc)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-azoth libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit)"

inherit rpm
