SUMMARY = "Screen Ruler"
DESCRIPTION = "A screen ruler for the Plasma desktop environment"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kruler-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "18168536ecc750c428e900f486829c07678df262f2e1a1bab4651efc5fd12072bfff2101a5677a550823e3bc5ff2879a36edd74b0ef44f8b15c28aa47c9fb9b8"

RPROVIDES:${PN} += "application() application(org.kde.kruler.desktop) kruler kruler(aarch-64) kruler5 metainfo() metainfo(org.kde.kruler.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
