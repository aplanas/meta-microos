SUMMARY = "Plasma Nano"
DESCRIPTION = "A minimal plasma shell package intended for embedded devices"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "plasma5-nano-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "a4e319cf7fbda44b22a9450a3e021aeb3834fab0da549b7973415ee04699b6a78bdbed918c50ddcb525e02e3cdbb0c4af1af3cb179ffd7c40312bb4845f4187c"

RPROVIDES:${PN} += "libplasmananoshellprivateplugin.so()(64bit) metainfo() metainfo(org.kde.plasma.nano.desktoptoolbox.appdata.xml) plasma5-nano plasma5-nano(aarch-64) qt5qmlimport(org.kde.plasma.private.nanoshell.2)"
RDEPENDS:${PN} += "kdeclarative-components kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Service.so.5()(64bit) libKF5WaylandClient.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libqt5-qtgraphicaleffects libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) plasma-framework-components plasma5-workspace qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Window.2) qt5qmlimport(org.kde.draganddrop.2) qt5qmlimport(org.kde.kcm.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.kquickcontrolsaddons.2) qt5qmlimport(org.kde.newstuff.1) qt5qmlimport(org.kde.plasma.components.3) qt5qmlimport(org.kde.plasma.configuration.2) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.extras.2) qt5qmlimport(org.kde.plasma.plasmoid.2) qt5qmlimport(org.kde.plasma.private.nanoshell.2) qt5qmlimport(org.kde.plasma.private.shell.2) qt5qmlimport(org.kde.plasma.wallpapers.image.2)"

inherit rpm
