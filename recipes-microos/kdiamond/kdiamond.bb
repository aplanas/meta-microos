SUMMARY = "Single player puzzle game"
DESCRIPTION = "The objective of the game is to build lines of three similar diamonds."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdiamond-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "751428293abe0f7656733ff33f89a300949aaca3a509b697568c411034f70af3c4493aa9d5a863aca32ffe1548b13fc3b547e5d806609140ca8f1d72a50c15e1"

RPROVIDES:${PN} += "application() application(org.kde.kdiamond.desktop) kdiamond kdiamond(aarch-64) kdiamond5 metainfo() metainfo(org.kde.kdiamond.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5Notifications.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
