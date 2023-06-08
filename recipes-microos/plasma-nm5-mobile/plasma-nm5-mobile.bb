SUMMARY = "Mobile settings support for plasma-nm5"
DESCRIPTION = "KConfig Modules and applets for \
wireless connectivity on Plasma Mobile."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.4"

RPM_NAME = "plasma-nm5-mobile-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "9bfb76040c945e0c10cc127228abae777003fb430cd2d6fb4a6c7b1d1718fa6512a72e469cf558e6ce97d9259b21cef2490cf737a1b4b14ac5c386ba4c48592b"

RPROVIDES:${PN} += "plasma-nm5-mobile plasma-nm5-mobile(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5NetworkManagerQt.so.6()(64bit) libKF5QuickAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) plasma-nm5 qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kcm.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.networkmanagement.0)"

inherit rpm
