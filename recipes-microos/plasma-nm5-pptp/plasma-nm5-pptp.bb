SUMMARY = "PPTP support for plasma-nm5"
DESCRIPTION = "Point-To-Point Tunneling Protocol (PPTP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.4"

RPM_NAME = "plasma-nm5-pptp-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "a22e648799abfe5468124ed4c995f89c57ea6041054b15ef351faaff73563b9a099b19cfd43e32d2841dc8349b1e9062f060d8779bd6d431da2def1ee999738a"

RPROVIDES:${PN} += "NetworkManager-pptp-frontend plasma-nm-pptp plasma-nm5-pptp plasma-nm5-pptp(aarch-64)"
RDEPENDS:${PN} += "NetworkManager-pptp ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5NetworkManagerQt.so.6()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libplasmanm_editor.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) plasma-nm5"

inherit rpm
