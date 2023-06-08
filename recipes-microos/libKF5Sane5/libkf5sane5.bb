SUMMARY = "KDE scan library"
DESCRIPTION = "The KDE scanner library provides an API and widgets for using \
scanners and other imaging devices supported by SANE."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "libKF5Sane5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "34ab56e14782144a09c5fe5d6fbedcd5fa7516fe8ccb2e98a73a61efd9444b7a836ea93060a3b2efafde8b3b2aa89b8b111d8aa929444d5ab82bfa9a937c10b2"

RPROVIDES:${PN} += "libKF5Sane.so.5()(64bit) libKF5Sane5 libKF5Sane5(aarch-64) libksane"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5Wallet.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKSaneCore.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
