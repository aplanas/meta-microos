SUMMARY = "Nonogram Logic game"
DESCRIPTION = "A nonogram logic game by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "picmi-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "6d13c64543fcd81a4bb9a17f1fba1902c03631b07d88c5a973f8bf6f717fdb15f2a01e88bf784d9ae7ce8bbbdabc0ffc6766d547ba6a67af78eab838b6f567a6"

RPROVIDES:${PN} += "application() application(org.kde.picmi.desktop) metainfo() metainfo(org.kde.picmi.appdata.xml) picmi picmi(aarch-64) picmi5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
