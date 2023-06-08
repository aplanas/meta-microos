SUMMARY = "FortiGate SSL VPN support for plasma-nm5"
DESCRIPTION = "FortiGate SSL VPN plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.4"

RPM_NAME = "plasma-nm5-fortisslvpn-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "4bb488130c43fabd4342beae9b856b2ea8ae4cd71faa85867651a1e6478b4c98d32fa1df0af89a39bc7a906e771ce5dad8f4708f8718958db531dd8e4a26012b"

RPROVIDES:${PN} += "NetworkManager-fortisslvpn-frontend plasma-nm5-fortisslvpn plasma-nm5-fortisslvpn(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5NetworkManagerQt.so.6()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libplasmanm_editor.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) plasma-nm5"

inherit rpm
