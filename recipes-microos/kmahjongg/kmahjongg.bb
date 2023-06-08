SUMMARY = "Mahjongg game"
DESCRIPTION = "KMahjongg is a clone of the well known tile based patience game of the \
same name. In the game you have to empty a game board filled with piece \
by removing pieces of the same type."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kmahjongg-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "929e199e6c015e62b457a106fe02e8eae8d11f17c8cffb517a66a6a5211e76f4e2fbab0aa2d962a5dfa4f2715999e72a1c3560747c43fb19f569775ebc5606f6"

RPROVIDES:${PN} += "application() application(org.kde.kmahjongg.desktop) kmahjongg kmahjongg(aarch-64) kmahjongg5 metainfo() metainfo(org.kde.kmahjongg.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5KMahjongglib.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
