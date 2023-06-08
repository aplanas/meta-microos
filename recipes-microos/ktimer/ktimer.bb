SUMMARY = "Countdown Launcher"
DESCRIPTION = "Countdown launching tool by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ktimer-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d569a7c6a33d2af57e30ac07117afb69b3a7df882c1ca06d8c9051425d12f1b5336fd54c242bf6365f3129e4fc8212969f8a5f916032bc9fdee3c8dfa842d843"

RPROVIDES:${PN} += "application() application(org.kde.ktimer.desktop) ktimer ktimer(aarch-64) ktimer5 metainfo() metainfo(org.kde.ktimer.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
