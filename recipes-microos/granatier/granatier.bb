SUMMARY = "Bomberman-like game"
DESCRIPTION = "In this game, the player walks through an arena, lays bombs and, in \
that way, is to kill enemies. Granatier is a clone of the popular \
Bomberman game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "granatier-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "499bc638986ca8024bf7c52c28264fa762337ac29e6c40600b2a906e28530dfa2d3d4771e3e0ed07b7cd3da589e2e227107a103d579b65e43db81ee606ba24c6"

RPROVIDES:${PN} += "application() application(org.kde.granatier.desktop) granatier granatier(aarch-64) granatier5 metainfo() metainfo(org.kde.granatier.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
