SUMMARY = "Plasma service for monitoring disk health"
DESCRIPTION = "Monitors S.M.A.R.T. capable devices for imminent failure and informs the user."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "plasma5-disks-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "fac5993ce5fd2a374f9c1b4bddd20abf606d43ea98295de69ad45cff7b1f92cee6fa8f98853d2f2fe3860f12da3692ebc62755f8a69ad572b371fb6d16959a7f"

RPROVIDES:${PN} += "metainfo() metainfo(org.kde.plasma.disks.metainfo.xml) plasma-disks plasma5-disks plasma5-disks(aarch-64)"
RDEPENDS:${PN} += "/usr/sbin/smartctl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5AuthCore.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5QuickAddons.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5Solid.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) qt5qmlimport(QtQml.Models.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kcm.1) qt5qmlimport(org.kde.kirigami.2)"

inherit rpm
