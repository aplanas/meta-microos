SUMMARY = "Task management and system monitoring library -- QML bindings"
DESCRIPTION = "This package provides QtQuick bindings for libksysguard, allowing its use in \
QML applications."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libksysguard5-imports-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "81934eae9622038a13d13ca0240e800f9ab568660f0c31a423408db952b6f17c46f894f1aaa5b7134716daac33865a6a6306b2a055be942b02e04beab2f999eb"

RPROVIDES:${PN} += "libFacesPlugin.so()(64bit) libFormatterPlugin.so()(64bit) libProcessPlugin.so()(64bit) libSensorsPlugin.so()(64bit) libksysguard5-imports libksysguard5-imports(aarch-64) qt5qmlimport(org.kde.ksysguard.faces.1) qt5qmlimport(org.kde.ksysguard.faces.private.1) qt5qmlimport(org.kde.ksysguard.formatter.1) qt5qmlimport(org.kde.ksysguard.process.1) qt5qmlimport(org.kde.ksysguard.sensors.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigQml.so.5()(64bit) libKSysGuardFormatter.so.1()(64bit) libKSysGuardSensorFaces.so.1()(64bit) libKSysGuardSensors.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libksysguard5 libprocesscore.so.9()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQml.Models.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Window.2) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.kitemmodels.1) qt5qmlimport(org.kde.ksysguard.faces.1) qt5qmlimport(org.kde.ksysguard.faces.private.1) qt5qmlimport(org.kde.ksysguard.formatter.1) qt5qmlimport(org.kde.ksysguard.sensors.1) qt5qmlimport(org.kde.quickcharts.1) qt5qmlimport(org.kde.quickcharts.controls.1)"

inherit rpm
