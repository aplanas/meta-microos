SUMMARY = "Task management and system monitoring library"
DESCRIPTION = "Task management and system monitoring library."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libksysguard5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "dd2bef88fa90511de798fe0a13cbd443a8be2963175dbb73c3e1bc5765f56ec812dffc3b8611c31336d0102677dfe041332d4375182a9f8e05d3522812367de5"

RPROVIDES:${PN} += "libKSysGuardFormatter.so.1()(64bit) \
libKSysGuardSensorFaces.so.1()(64bit) \
libKSysGuardSensors.so.1()(64bit) \
libksgrd.so.9()(64bit) \
libksignalplotter.so.9()(64bit) \
libksysguard5 \
libksysguard5(aarch-64) \
liblsofui.so.9()(64bit) \
libprocesscore.so.9()(64bit) \
libprocessui.so.9()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5AuthCore.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigQml.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5Package.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKSysGuardSystemStats.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5WebChannel.so.5()(64bit) \
libQt5WebChannel.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXRes.so.1()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libz.so.1()(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.kitemmodels.1) \
qt5qmlimport(org.kde.ksysguard.faces.1) \
qt5qmlimport(org.kde.ksysguard.formatter.1) \
qt5qmlimport(org.kde.ksysguard.sensors.1) \
qt5qmlimport(org.kde.quickcharts.1) \
qt5qmlimport(org.kde.quickcharts.controls.1)"

inherit rpm
