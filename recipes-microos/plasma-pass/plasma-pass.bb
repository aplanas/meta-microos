SUMMARY = "Plasma 5 widget for the pass password manager"
DESCRIPTION = "Plasma Pass is a Plasma 5 widget to access, display and copy passwords \
generated and stored by the 'pass' password manager."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "plasma-pass-1.2.0-3.8.aarch64.rpm"
RPM_HASH = "02be0063430d7916c02e658a7dd8e3d6811758575b76fe4db3828208e29b82f5b3ea47458d18da67943801f095ddd6d5127681a734d21513ab4101a6899a46fc"

RPROVIDES:${PN} += "libplasmapassplugin.so()(64bit) metainfo() metainfo(org.kde.plasma.pass.appdata.xml) plasma-pass plasma-pass(aarch-64) qt5qmlimport(org.kde.plasma.private.plasmapass.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemModels.so.5()(64bit) libKF5Plasma.so.5()(64bit) libQt5Concurrent.so.5()(64bit) libQt5Concurrent.so.5(Qt_5)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) liboath.so.0()(64bit) liboath.so.0(LIBOATH_1.12.0)(64bit) liboath.so.0(LIBOATH_1.4.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQml.Models.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.plasma.components.2) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.extras.2) qt5qmlimport(org.kde.plasma.plasmoid.2) qt5qmlimport(org.kde.plasma.private.plasmapass.1)"

inherit rpm
