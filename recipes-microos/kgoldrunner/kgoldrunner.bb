SUMMARY = "Action & Puzzle Solving Game"
DESCRIPTION = "KGoldrunner is a game of action and puzzle solving"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kgoldrunner-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d7ef14e0b5d245d9f5677007d05157fa62252ccc96cfd5e8b1e0ad4982efdc182cf9c838a00c6a30cbb2cf2eac85c49abcb526e1a88375201743d518b0bd4e79"

RPROVIDES:${PN} += "application() application(org.kde.kgoldrunner.desktop) kgoldrunner kgoldrunner(aarch-64) metainfo() metainfo(org.kde.kgoldrunner.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5KIOCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
