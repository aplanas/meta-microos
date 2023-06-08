SUMMARY = "Plasma 5 version of ssh-askpass"
DESCRIPTION = "A Plasma 5 version of ssh-askpass with KWallet support."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "ksshaskpass5-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "90060099aaedc1a3c7c0041cc6a0c15843a51d82978eb93f4a74bf8941ce9ba488a46004bfd15d3a7419bd59b7365f490c1ee928f9c95e3143a4323551acb6ef"

RPROVIDES:${PN} += "ksshaskpass ksshaskpass5 ksshaskpass5(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Wallet.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
