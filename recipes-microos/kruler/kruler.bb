SUMMARY = "Screen Ruler"
DESCRIPTION = "A screen ruler for the Plasma desktop environment"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kruler-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "25219f0258775bea2f34ab7214ae60b178b58c2230b9601aaf26fa178f647687cd1ba110ab72e4c8f112b90367a76fb5cc15bb6c10a27de984e2703f26d7cd8c"

RPROVIDES:${PN} += "application() application(org.kde.kruler.desktop) kruler kruler(aarch-64) kruler5 metainfo() metainfo(org.kde.kruler.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
