SUMMARY = "Logic game with elements of hide-and-seek"
DESCRIPTION = "KBlackbox is a graphical logical game, inspired by emacs's blackbox. It \
is a game of hide and seek played on an grid of boxes."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kblackbox-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "c6053d8a81e14b8159adf5c31e54570ea53ede28984efba52fe9003d732fe721a9684ada8155775e072f02844166e82097ecd2e93f9772f6c3b47e656a4359ed"

RPROVIDES:${PN} += "application() application(org.kde.kblackbox.desktop) kblackbox kblackbox(aarch-64) kblackbox5 metainfo() metainfo(org.kde.kblackbox.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
