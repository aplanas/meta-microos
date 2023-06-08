SUMMARY = "Traditional Chinese Boardgame by KDE"
DESCRIPTION = "Traditional Chinese Boardgame."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kigo-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "8ad7ce8685aa75928c5e7564513fab551d040565c341f40aaeb10c41733efb36d1beecb6c83b9deeef3f3e70905566d2c7232c2dac0cdafed6eacb181bdb53a6"

RPROVIDES:${PN} += "application() application(org.kde.kigo.desktop) kigo kigo(aarch-64) kigo5 metainfo() metainfo(org.kde.kigo.appdata.xml) mimehandler(application/x-go-sgf)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5NewStuffWidgets.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
