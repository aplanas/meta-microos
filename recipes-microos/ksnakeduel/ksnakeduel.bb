SUMMARY = "Simple snake duel game"
DESCRIPTION = "KSnakeDuel is a simple snake duel game"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ksnakeduel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "d541c269229b35486e2342ad6fdc68bda4139e6b394b3b08efe03fc165a20ac2674b95a7bd5c184018c9197be9749246958951b197b583b80972e19eff9b189f"

RPROVIDES:${PN} += "application() application(org.kde.ksnakeduel.desktop) ksnakeduel ksnakeduel(aarch-64) ksnakeduel5 metainfo() metainfo(org.kde.ksnakeduel.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
