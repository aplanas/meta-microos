SUMMARY = "OpenVPN support for plasma-nm5"
DESCRIPTION = "OpenVPN plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.4"

RPM_NAME = "plasma-nm5-openvpn-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "ff110bfed57014f55691ba6def9f28ec497d14a6ea61557f26b619d9d73cbb82ba9aa057382d0fea3c4e05e51327ec2d4786854aa385f99a9f1f1e0b1eaf5a54"

RPROVIDES:${PN} += "NetworkManager-openvpn-frontend plasma-nm-openvpn plasma-nm5-openvpn plasma-nm5-openvpn(aarch-64)"
RDEPENDS:${PN} += "NetworkManager-openvpn ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5NetworkManagerQt.so.6()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libnm.so.0()(64bit) libnm.so.0(libnm_1_0_0)(64bit) libnm.so.0(libnm_1_2_0)(64bit) libplasmanm_editor.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) plasma-nm5"

inherit rpm
