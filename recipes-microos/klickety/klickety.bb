SUMMARY = "Strategic board game"
DESCRIPTION = "Klickety is an adaptation of the Clickomania and SameGame games."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "klickety-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a48d6fa89d8ca9fe950bf4493999dcb50240d0250f8e079c0161d92fc3bff34b60addfa8fa5797db6edc2b3663c1593ca6456ebf96fdf586640ab2575b102ce2"

RPROVIDES:${PN} += "application() application(org.kde.klickety.desktop) application(org.kde.ksame.desktop) klickety klickety(aarch-64) klickety5 metainfo() metainfo(org.kde.klickety.appdata.xml) metainfo(org.kde.ksame.appdata.xml)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
