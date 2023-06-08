SUMMARY = "Geography Trainer"
DESCRIPTION = "KGeography is a geography learning program."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kgeography-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "c23c1afcd1d63ebe4fa45281d66224a6eff86aeb4199f423c5c37df662c8dca665b2640908019d4ffbbb047b4ce3d11b5d77a92bc181922ada3ae4b388098c9a"

RPROVIDES:${PN} += "application() application(org.kde.kgeography.desktop) kgeography kgeography(aarch-64) kgeography5 metainfo() metainfo(org.kde.kgeography.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
