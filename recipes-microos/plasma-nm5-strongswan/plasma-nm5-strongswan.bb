SUMMARY = "strongSwan support for plasma-nm5"
DESCRIPTION = "strongSwan plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.4"

RPM_NAME = "plasma-nm5-strongswan-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "391925a6ee45a538d77b89728faeb0bb2cbdd8572deb46e27f705f0b30a632b43a1b9c6cdfa8f2001939b5432201106e438b5188a20f39b8a67c1bfd83219e45"

RPROVIDES:${PN} += "NetworkManager-strongswan-frontend plasma-nm-strongswan plasma-nm5-strongswan plasma-nm5-strongswan(aarch-64)"
RDEPENDS:${PN} += "NetworkManager-strongswan ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5NetworkManagerQt.so.6()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libplasmanm_editor.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) plasma-nm5"

inherit rpm
