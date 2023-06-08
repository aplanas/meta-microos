SUMMARY = "KDE Accounts Providers"
DESCRIPTION = "KDE Accounts Providers."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kaccounts-providers-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "afb461033280bc92c9a58bca9c5a4271a91bfa5c0f1bcd57e3168c822ec09461ea617b962d5f948e0e4a4f02949f1eb9f4d567d6843a28b08486287e9e50dd2f"

RPROVIDES:${PN} += "kaccounts-providers kaccounts-providers(aarch-64) metainfo() metainfo(org.kde.kaccounts.nextcloud.appdata.xml) metainfo(org.kde.kaccounts.owncloud.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Declarative.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5Package.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5WebEngine.so.5()(64bit) libQt5WebEngine.so.5(Qt_5)(64bit) libQt5WebEngineCore.so.5()(64bit) libQt5WebEngineCore.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libkaccounts.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtWebEngine.1) qt5qmlimport(org.kde.kirigami.2) signon-plugin-oauth2"

inherit rpm
