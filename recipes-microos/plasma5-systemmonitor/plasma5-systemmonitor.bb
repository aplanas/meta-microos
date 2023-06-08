SUMMARY = "An application for monitoring system resources"
DESCRIPTION = "plasma-systemmonitor provides an interface for monitoring system sensors, \
process information and other system resources."
LICENSE = "GPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "plasma5-systemmonitor-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "9202c3f0c82ddbd30d46fdd34cd6afc063db96cbe5fe2fa11524f446bd815e1699a86aac4eda62c4c46111d21e5ae907b9053bf4b4738decffbfbb244dbaeb9f"

RPROVIDES:${PN} += "application() application(org.kde.plasma-systemmonitor.desktop) libPagePlugin.so()(64bit) libTablePlugin.so()(64bit) metainfo() metainfo(org.kde.plasma-systemmonitor.metainfo.xml) plasma5-systemmonitor plasma5-systemmonitor(aarch-64) qt5qmlimport(org.kde.ksysguard.page.1) qt5qmlimport(org.kde.ksysguard.table.1)"
RDEPENDS:${PN} += "kdeclarative-components kirigami2 kitemmodels-imports knewstuff-imports kquickcharts ksystemstats5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemModels.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKSysGuardSensorFaces.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libqt5-qtquickcontrols2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qqc2-desktop-style qt5qmlimport(Qt.labs.platform.1) qt5qmlimport(Qt.labs.qmlmodels.1) qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtQml.2) qt5qmlimport(QtQml.Models.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kcoreaddons.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.kitemmodels.1) qt5qmlimport(org.kde.kquickcontrolsaddons.2) qt5qmlimport(org.kde.ksysguard.faces.1) qt5qmlimport(org.kde.ksysguard.formatter.1) qt5qmlimport(org.kde.ksysguard.page.1) qt5qmlimport(org.kde.ksysguard.process.1) qt5qmlimport(org.kde.ksysguard.sensors.1) qt5qmlimport(org.kde.ksysguard.table.1) qt5qmlimport(org.kde.newstuff.1) qt5qmlimport(org.kde.qqc2desktopstyle.private.1) qt5qmlimport(org.kde.quickcharts.1) qt5qmlimport(org.kde.quickcharts.controls.1)"

inherit rpm
