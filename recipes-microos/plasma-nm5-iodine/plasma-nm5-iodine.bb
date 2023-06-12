SUMMARY = "VPN support for plasma-nm5"
DESCRIPTION = "Iodine (VPN through DNS tunnel) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-iodine-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "c4b35efa3bc5f2fcd3a7401e17a614aee1a1f9564e043cd3b0739583035ae08d790306e7a0d8fe1e5fd9a6ae091f4cf536da9457f1e404278a79809b2b758c05"

RPROVIDES:${PN} += "NetworkManager-iodine-frontend \
plasma-nm5-iodine \
plasma-nm5-iodine(aarch-64)"
RDEPENDS:${PN} += "NetworkManager-iodine \
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
