SUMMARY = "KDE Accounts Providers"
DESCRIPTION = "Small system to administer web accounts for the sites \
and services across the KDE desktop, including: Google, \
Facebook, Owncloud, IMAP, Jabber and others."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kaccounts-integration-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "09ea1aeeb93cc9fbe0dd41902e8b13d6317ca91d14c7eb2226f33d763d3fcc23b02c4b01d2660cc2e44dcf68b0fac20af05bdf4367004b4844b7152a94bd7822"

RPROVIDES:${PN} += "application() application(kcm_kaccounts.desktop) kaccounts-integration kaccounts-integration(aarch-64) libkaccountsdeclarativeplugin.so()(64bit) qt5qmlimport(org.kde.kaccounts.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5QuickAddons.so.5()(64bit) libKF5Wallet.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libaccounts-qt5.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libkaccounts.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kaccounts.1) qt5qmlimport(org.kde.kcm.1) qt5qmlimport(org.kde.kirigami.2)"

inherit rpm
