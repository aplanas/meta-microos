SUMMARY = "Kollision game"
DESCRIPTION = "KDE version of a classic arcade game"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kollision-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "40a550d393d700fe17712ec0b0d04ad2026b32999d55a852dc2a39aa380b3cdec9fb37e49ee2718a12deb811431a85bec543462c5a4c8e706a2ad2745573311e"

RPROVIDES:${PN} += "application() application(org.kde.kollision.desktop) kollision kollision(aarch-64) kollision5 metainfo() metainfo(org.kde.kollision.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
