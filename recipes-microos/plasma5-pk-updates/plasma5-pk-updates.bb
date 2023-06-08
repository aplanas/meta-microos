SUMMARY = "Software Update Manager for Plasma"
DESCRIPTION = "Plasma applet for software updates using PackageKit."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.2+git70"

RPM_NAME = "plasma5-pk-updates-0.3.2+git70-2.6.aarch64.rpm"
RPM_HASH = "f67f217f0a2cdff5d15f22141f96fc8e711bdc9fcea7fd46b821963d1ad512dfb35d62f599d5edfeb138839fcce5b5703266dce91e2cc87043ec4c7282601d39"

RPROVIDES:${PN} += "apper libplasmapk_qmlplugins.so()(64bit) metainfo() metainfo(org.kde.plasma.pkupdates.appdata.xml) plasma5-pk-updates plasma5-pk-updates(aarch-64) qt5qmlimport(org.kde.plasma.PackageKit.1)"
RDEPENDS:${PN} += "PackageKit ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Solid.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpackagekitqt5.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Dialogs.1) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.plasma.PackageKit.1) qt5qmlimport(org.kde.plasma.components.3) qt5qmlimport(org.kde.plasma.configuration.2) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.extras.2) qt5qmlimport(org.kde.plasma.plasmoid.2)"

inherit rpm
