SUMMARY = "Math Expression Solver and Plotter - mobile version"
DESCRIPTION = "KAlgebra is a math expression solver and plotter. This package includes \
a QtQuick based version for use in mobile (phone, tablet) environments."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kalgebra-mobile-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "ff7df523983e99d71389d55dd418155be21475aeb8a479d5f86390e87c063c560fbfd0df837b82e77d495849f7b66a20b19ac5fbfd68e964becf0409b07dbc2a"

RPROVIDES:${PN} += "application() application(org.kde.kalgebramobile.desktop) kalgebra-mobile kalgebra-mobile(aarch-64) metainfo() metainfo(org.kde.kalgebramobile.appdata.xml) mimehandler(application/x-kalgebra)"
RDEPENDS:${PN} += "kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libAnalitza.so.8()(64bit) libAnalitzaPlot.so.8()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libqt5-qtquickcontrols2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
