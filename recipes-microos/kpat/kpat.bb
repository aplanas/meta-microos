SUMMARY = "Patience card game"
DESCRIPTION = "KPatience is a collection of various patience games known all over the \
world. It includes Klondike, Freecell, Yukon, Forty and Eight and many \
more. The game has nice graphics and many different carddecks."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kpat-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "eaa949f8f5daab0d306a7fd605d40dcec6708ff167a9a3eb91b16c48115fa65ab9abb91af9c5cabd3a6841495df1b2afb6af0787f339c296e2e9152d48f0935c"

RPROVIDES:${PN} += "application() application(org.kde.kpat.desktop) kpat kpat(aarch-64) kpat5 libkcardgame.so()(64bit) metainfo() metainfo(org.kde.kpat.appdata.xml) mimehandler(application/vnd.kde.kpatience.savedstate)"
RDEPENDS:${PN} += "kdegames-carddecks-default ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5KIOCore.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5NewStuffWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libblack_hole_solver.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreecell-solver.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
