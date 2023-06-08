SUMMARY = "Jigsaw puzzle game"
DESCRIPTION = "Palapeli is a jigsaw puzzle game. Unlike other games in that genre, you are not \
limited to aligning pieces on imaginary grids. The pieces are freely moveable. \
Also, Palapeli features real persistency, i.e. everything you do is saved on \
your disk immediately."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "palapeli-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "f502b63d9807adefd5c91924330cb8df26da287dd59ab3357b40fd48b2a97d3724145276e4117eaf8b15e9c5da8cfddd8ebef5f400e2d236fb2578121fc1ff0a"

RPROVIDES:${PN} += "application() application(org.kde.palapeli.desktop) libpala.so.0()(64bit) metainfo() metainfo(org.kde.palapeli.appdata.xml) mimehandler(application/x-palapeli-puzzle) palapeli palapeli(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) palapeli-data"

inherit rpm
