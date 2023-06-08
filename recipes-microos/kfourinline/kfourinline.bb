SUMMARY = "Four Wins game"
DESCRIPTION = "Four wins is a two-player board game where you have to align four \
(gravity-affected) pieces of the same colour to win."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kfourinline-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "c0a9fa9a2b8395659d5248c4e8a41425adba1f5d7d246c2d7b4aa6d81ee3a4c719a404670a8fa913935cf073269710cb91a829a7e016e5dc3b9e8c541d60fa54"

RPROVIDES:${PN} += "application() application(org.kde.kfourinline.desktop) kfourinline kfourinline(aarch-64) kfourinline5 metainfo() metainfo(org.kde.kfourinline.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DNSSD.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5KDEGamesPrivate.so.7()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
