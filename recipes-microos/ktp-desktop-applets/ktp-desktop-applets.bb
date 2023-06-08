SUMMARY = "Telepathy presence applet"
DESCRIPTION = "This package provides a Plasma applet to launch your Telepathy contacts list."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-desktop-applets-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e1d0ac4257f02ad9952b825798e1e32492a9c4b5eabfc325a480e38eeae512fb653ba440707612562bc8a9f31725be4b8ee9ea3b6309217a7975e9c93f88076d"

RPROVIDES:${PN} += "ktp-contact-applet ktp-desktop-applets ktp-desktop-applets(aarch-64) ktp-desktop-applets5 ktp-presence-applet libktpchatplugin.so()(64bit) libktpcontactlistplugin.so()(64bit) qt5qmlimport(org.kde.ktpchat.0) qt5qmlimport(org.kde.ktpcontactlist.0)"
RDEPENDS:${PN} += "ktp-common-internals ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.1) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kquickcontrolsaddons.2) qt5qmlimport(org.kde.ktpchat.0) qt5qmlimport(org.kde.ktpcontactlist.0) qt5qmlimport(org.kde.people.1) qt5qmlimport(org.kde.plasma.components.2) qt5qmlimport(org.kde.plasma.configuration.2) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.extras.2) qt5qmlimport(org.kde.plasma.plasmoid.2) qt5qmlimport(org.kde.telepathy.0)"

inherit rpm
