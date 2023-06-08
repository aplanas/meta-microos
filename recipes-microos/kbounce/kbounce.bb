SUMMARY = "Bounce ball game"
DESCRIPTION = "Your task in KBounce (Jezz Ball) is to catch several moving balls in a \
rectangular game field by building walls. The motivation consists of \
finding new and advanced strategies to catch as many balls as possible."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kbounce-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "f8b73b2a95caa2788b8c35c82207138c9b4c5076b75c71ede6d0497b33087d2daab4fe9990e37562c44e7e29b83ccd09ff6567ca865d38354b0bc6f9ba6a5ec8"

RPROVIDES:${PN} += "application() application(org.kde.kbounce.desktop) kbounce kbounce(aarch-64) kbounce5 metainfo() metainfo(org.kde.kbounce.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
