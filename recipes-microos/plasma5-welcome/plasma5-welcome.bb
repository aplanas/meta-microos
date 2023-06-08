SUMMARY = "Onboarding wizard for Plasma"
DESCRIPTION = "Welcome Center is the perfect introduction to KDE Plasma! It can help you learn how to connect to the internet, install apps, customize the system, and more!"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "plasma5-welcome-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "895d286247599a43fb866c54989e02d6aa9b735bd91231b40003170bff7974d3b42a387ce14edfb8ce2d8db41d8d6d090a4eca1f325f3917316f45e234598a36"

RPROVIDES:${PN} += "application() application(org.kde.plasma-welcome.desktop) metainfo() metainfo(org.kde.plasma-welcome.appdata.xml) plasma5-welcome plasma5-welcome(aarch-64) qt5qmlimport(org.kde.plasma.welcome.1)"
RDEPENDS:${PN} += "kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5QuickAddons.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.plasma.welcome.1)"

inherit rpm
