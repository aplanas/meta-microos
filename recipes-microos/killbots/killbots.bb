SUMMARY = "Robots-like game by KDE"
DESCRIPTION = "Killbots is a turn-based game of evading 'killer' robots on a board. \
Robots home in on the player, but can crash into other robots or \
debris, rendering them inert. The player has to strategically move \
and can optionally use teleportation to a random location."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "killbots-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "10b3f1abcfb1c14b8050cfc4bf6d10eabf2292c9777190eb257acb48539668dde67f650f3f854135a4f463d0cb0565821c34c5f93d29eea09ce363d29711b436"

RPROVIDES:${PN} += "application() application(org.kde.killbots.desktop) killbots killbots(aarch-64) killbots5 metainfo() metainfo(org.kde.killbots.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
