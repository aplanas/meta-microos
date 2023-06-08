SUMMARY = "Channel Approver for KDE Telepathy implementation"
DESCRIPTION = "A channel approver for KDE's Telepathy implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-approver-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "6522125162fb7f11d4507130fc8959c2018c1bf193f78266e71bf2a095e54e37cfbd8652582c0fd0a8e0771740a19e2de60318f10acd19e1cc1433596723dc06"

RPROVIDES:${PN} += "config(ktp-approver) ktp-approver ktp-approver(aarch-64) ktp-approver5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Service.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtelepathy-qt5.so.0()(64bit)"

inherit rpm
