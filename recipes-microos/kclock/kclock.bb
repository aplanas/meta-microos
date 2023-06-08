SUMMARY = "Clock application for Plasma"
DESCRIPTION = "A clock application for Plasma."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kclock-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "63d7262430341709a86bf68c07edbe77353ee24697109f641e6651aaeb5ee40d13256047f9f6f66566486e597e5e6cc72173c736925248266dcaa53455da55cb"

RPROVIDES:${PN} += "application() application(org.kde.kclock.desktop) kclock kclock(aarch-64) metainfo() metainfo(org.kde.kclock.appdata.xml) metainfo(org.kde.plasma.kclock_1x2.appdata.xml)"
RDEPENDS:${PN} += "kirigami-addons kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Plasma.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.plasma.components.2) qt5qmlimport(org.kde.plasma.configuration.2) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.plasmoid.2)"

inherit rpm
