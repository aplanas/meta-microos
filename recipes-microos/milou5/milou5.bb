SUMMARY = "Dedicated search application built on top of Baloo"
DESCRIPTION = "A dedicated search application built on top of Baloo"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.27.4"

RPM_NAME = "milou5-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "a626375b8614f8b1d94afd07a97f99ff8632c30249fa4ce45dd42a69bf09ef55dad7375024f835a5bd5311f3d788871cdb462ec4dacbfba4e78a7316d015dadf"

RPROVIDES:${PN} += "libmilou.so.5()(64bit) libmilouqmlplugin.so()(64bit) metainfo() metainfo(org.kde.milou.appdata.xml) milou5 milou5(aarch-64) qt5qmlimport(org.kde.milou.0)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5ItemModels.so.5()(64bit) libKF5Runner.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kquickcontrolsaddons.2) qt5qmlimport(org.kde.milou.0) qt5qmlimport(org.kde.plasma.components.2) qt5qmlimport(org.kde.plasma.components.3) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.plasmoid.2)"

inherit rpm
