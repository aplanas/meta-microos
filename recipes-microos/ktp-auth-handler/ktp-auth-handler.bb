SUMMARY = "Telepathy auth handler"
DESCRIPTION = "Telepathy-auth-handler provides UI/KWallet integration for passwords and \
SSL errors on account connect."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-auth-handler-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "67b01218f7c96dd3afdd3f382733789de50f860d194be23528143cda85c01a722db397c7379b36c421f0bb74cf60aded41b75d8a912d0c02268fb6e20c12433d"

RPROVIDES:${PN} += "ktp-auth-handler ktp-auth-handler(aarch-64) ktp-auth-handler5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKTpCommonInternals.so.9()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libaccounts-qt5.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libkaccounts.so.2()(64bit) libqca-qt5-plugins libqca-qt5.so.2()(64bit) libsignon-qt5.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtelepathy-qt5.so.0()(64bit) signon-plugin-oauth2"

inherit rpm
