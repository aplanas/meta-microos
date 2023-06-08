SUMMARY = "Qt 5 Graphical Effects"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtgraphicaleffects-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "0bb43f64ab7e4f9b2d39346f2c8061fe32e013d13156b04fecd6601057ce9837c12b7862657868b73d891e224c8810c6e2a418eb36bc070c58e7405d60022854"

RPROVIDES:${PN} += "libqt5-qtgraphicaleffects libqt5-qtgraphicaleffects(aarch-64) libqtgraphicaleffectsplugin.so()(64bit) libqtgraphicaleffectsprivate.so()(64bit) qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtGraphicalEffects.private.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQtQuick5 libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtGraphicalEffects.private.1) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Window.2)"

inherit rpm
