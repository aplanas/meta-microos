SUMMARY = "L2TP support for plasma-nm5"
DESCRIPTION = "Layer Two Tunneling Protocol (L2TP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.4"

RPM_NAME = "plasma-nm5-l2tp-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "7e17b7666a232bebaaae5dce01125c206f540d1c24435c0a0fc3cdeb75df205d9a3977845256f1486ec3cbcd6aee962dd210c7ab1d78a98a28f1cdf63357a7e5"

RPROVIDES:${PN} += "NetworkManager-l2tp-frontend plasma-nm-l2tp plasma-nm5-l2tp plasma-nm5-l2tp(aarch-64)"
RDEPENDS:${PN} += "NetworkManager-l2tp ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5NetworkManagerQt.so.6()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libplasmanm_editor.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) plasma-nm5"

inherit rpm
