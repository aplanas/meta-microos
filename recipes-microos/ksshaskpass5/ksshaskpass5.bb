SUMMARY = "Plasma 5 version of ssh-askpass"
DESCRIPTION = "A Plasma 5 version of ssh-askpass with KWallet support."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "ksshaskpass5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "63a8f05755c6e1c61d70db790d0ef588ae4d910cd092d4432b3cfdfd9ef25e0e33320f904687740bd67b25f5bcc1a3c926b58b2b67a40a2fab0b665a854ee4f0"

RPROVIDES:${PN} += "ksshaskpass ksshaskpass5 ksshaskpass5(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Wallet.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
