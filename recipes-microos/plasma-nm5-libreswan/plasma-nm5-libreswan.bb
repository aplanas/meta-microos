SUMMARY = "Libreswan support for plasma-nm5"
DESCRIPTION = "Libreswan plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-libreswan-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "0f3886de191a96e13938351e4d7c93d5e324ab6a2de81ea046fc22a25a5c6809997184dd22f87f67e5ff7b449dc81ee79f0bbb3a9f74fab44a36a2d8a7046712"

RPROVIDES:${PN} += "NetworkManager-libreswan-frontend \
plasma-nm-openswan \
plasma-nm5-libreswan \
plasma-nm5-libreswan(aarch-64) \
plasma-nm5-openswan"
RDEPENDS:${PN} += "NetworkManager-libreswan \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5NetworkManagerQt.so.6()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libplasmanm_editor.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
plasma-nm5"

inherit rpm
