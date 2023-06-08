SUMMARY = "Pac-Man-like game by KDE"
DESCRIPTION = "Kapman is a clone of the well known game Pac-Man. You must go through the levels \
escaping ghosts in a maze. You lose a life when a ghost eats you, but you can \
eat the ghosts for a few seconds when eating an energizer. You win points when \
eating pills, energizers, and bonus, and you win one life for each 10,000 \
points. When you have eaten all the pills and energizers of a level, you go to \
the next level, and the player and ghost speeds increase. The game ends when you \
have lost all your lives."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kapman-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "bea9c9c8d6d6090400ac43d69a1fb4d3a52f38eb87c6ff312dd4336fdbd48a23eca7ebd6b56012670883fac736b37a7b42eac3cd4b514e4f6d58d83d394427c5"

RPROVIDES:${PN} += "application() application(org.kde.kapman.desktop) kapman kapman(aarch-64) kapman5 metainfo() metainfo(org.kde.kapman.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
