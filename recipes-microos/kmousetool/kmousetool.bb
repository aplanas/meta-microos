SUMMARY = "Automatic Mouse Click"
DESCRIPTION = "Clicks the mouse for you, reducing hand strain."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kmousetool-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "697ed5c30c4ea163ab762a7ccdb0420aed0c3dd508e0e59d7582c672ba94a9e89c8986d989512723de769a7121b3ae1125d8f6fdee110ef8e33e6499fd9ea01b"

RPROVIDES:${PN} += "application() application(org.kde.kmousetool.desktop) kmousetool kmousetool(aarch-64) kmousetool5 metainfo() metainfo(org.kde.kmousetool.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libXtst.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libphonon4qt5.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
