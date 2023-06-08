SUMMARY = "Wallet Management Tool"
DESCRIPTION = "This application allows you to manage your KDE password wallet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kwalletmanager5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "9cd6b87861eb71863a28325a7cba1e9fb11d424304cdd3c4f8f84d15a7c42076f370e206102b853168ff6a5a1e2e06adace96331029d85d6c465232a93ac61eb"

RPROVIDES:${PN} += "application() application(kwalletmanager5-kwalletd.desktop) application(org.kde.kwalletmanager5.desktop) kwalletmanager kwalletmanager5 kwalletmanager5(aarch-64) metainfo() metainfo(org.kde.kwalletmanager5.appdata.xml) mimehandler(application/x-kwallet)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5AuthCore.so.5()(64bit) libKF5Codecs.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Wallet.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit)"

inherit rpm
