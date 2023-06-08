SUMMARY = "Risk-like game by KDE"
DESCRIPTION = "KsirK is a computerized version of a well known strategy game."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ksirk-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e74b504948dd115d967563b361e6b39e0563d23499a75404de28c2420aa016319ab272763f55ac463b9e06b63a36482da5f915306d6c7f4931e865bd3bcf9003"

RPROVIDES:${PN} += "application() application(org.kde.ksirk.desktop) application(org.kde.ksirkskineditor.desktop) ksirk ksirk(aarch-64) ksirk5 libiris_ksirk.so.2()(64bit) metainfo() metainfo(org.kde.ksirk.appdata.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5KDEGamesPrivate.so.7()(64bit) libKF5NewStuff.so.5()(64bit) libKF5Wallet.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libphonon4qt5.so.4()(64bit) libqca-qt5.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libz.so.1()(64bit)"

inherit rpm
