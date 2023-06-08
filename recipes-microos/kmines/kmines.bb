SUMMARY = "Minesweeper-like game"
DESCRIPTION = "KMines is the classical Minesweeper game where you have to find mines \
by logical deduction."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kmines-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e5ef364d859ad3fa57931e171ddc969de0e3dd674bf32ad9635c8cbe10a68a251105a1499b7cb73d636d359c6d6eba2dbc3a43f4188168dfc8b048d60819b87f"

RPROVIDES:${PN} += "application() application(org.kde.kmines.desktop) kmines kmines(aarch-64) kmines5 metainfo() metainfo(org.kde.kmines.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
