SUMMARY = "KDE Privacy Utility"
DESCRIPTION = "Helps clean unwanted traces the user leaves on the system."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "sweeper-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "66c913d14d3f9914f128d23b3c3a00fa2ae8919aeb4b0ad1242d04eb0669d6667a9ddb7b9a93d0f528ddbe639ca02998f617620d1e37bc6711efd5c1cf5a4d56"

RPROVIDES:${PN} += "application() application(org.kde.sweeper.desktop) metainfo() metainfo(org.kde.sweeper.appdata.xml) sweeper sweeper(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ActivitiesStats.so.1()(64bit) libKF5Bookmarks.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
