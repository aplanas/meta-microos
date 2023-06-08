SUMMARY = "VPN support for plasma-nm5"
DESCRIPTION = "Iodine (VPN through DNS tunnel) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.4"

RPM_NAME = "plasma-nm5-iodine-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "a25db99695ae2a420044b8a4f1df796106dd6ce93a3cb2af32233663000ae85e801a24c8efd3c827bccc42c6ee7d3f2b06b18adf295bc9ce2a9f7b09197f8d77"

RPROVIDES:${PN} += "NetworkManager-iodine-frontend plasma-nm5-iodine plasma-nm5-iodine(aarch-64)"
RDEPENDS:${PN} += "NetworkManager-iodine ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5NetworkManagerQt.so.6()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libplasmanm_editor.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) plasma-nm5"

inherit rpm
