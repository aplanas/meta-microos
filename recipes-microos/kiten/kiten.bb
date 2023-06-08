SUMMARY = "Japanese Reference/Study Tool"
DESCRIPTION = "Kiten is a tool to learn Japanese."
LICENSE = "GPL-2.0-or-later & CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "23.04.0"

RPM_NAME = "kiten-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a13e15b91079ecccf41952b8ae9aba907a2f6573255ef6c691bd6ecf830a84170ae2284aa2f8854e02283ce95822400373e76c9066d673e05858a41e42dd8877"

RPROVIDES:${PN} += "application() application(org.kde.kiten.desktop) application(org.kde.kitenkanjibrowser.desktop) application(org.kde.kitenradselect.desktop) kiten kiten(aarch-64) kiten5 libkiten.so.5()(64bit) metainfo() metainfo(org.kde.kiten.appdata.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig fonts-KanjiStrokeOrders ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
