SUMMARY = "German Skat game"
DESCRIPTION = "Lieutenant Skat is a nice two player card game which follows the rules \
for the German game (Offiziers)-Skat. The program includes many \
different carddecks to choose. A computer opponent can play for any of \
the players."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "lskat-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "723f6b56c956f248fc18ab19c4a1a7bacfb7267a2975e0259870a507ebcb763e2127383e8ca5ca6f983f8563f1f7a5c00a189e5973703036e1a2730179833626"

RPROVIDES:${PN} += "application() application(org.kde.lskat.desktop) lskat lskat(aarch-64) lskat5 metainfo() metainfo(org.kde.lskat.appdata.xml)"
RDEPENDS:${PN} += "kdegames-carddecks-default ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
