SUMMARY = "Library and components for secure lock screen architecture"
DESCRIPTION = "Library and components for secure lock screen architecture."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "kscreenlocker-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "0f2f80b09cdd926693c2dd08b61a39ebde4345a1e3711a4d497d861993256c7f016f43a90c0f1e3faa7d3c8e9e067d459ce65065e4fd12abfbb6586cc626cfba"

RPROVIDES:${PN} += "application() application(kcm_screenlocker.desktop) kscreenlocker kscreenlocker(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/killall /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigQml.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5Declarative.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5Package.so.5()(64bit) libKF5QuickAddons.so.5()(64bit) libKF5ScreenDpms.so.8()(64bit) libKF5WaylandClient.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libLayerShellQtInterface.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libwayland-client.so.0()(64bit) pam-config qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kcm.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.kquickcontrols.2)"

inherit rpm
