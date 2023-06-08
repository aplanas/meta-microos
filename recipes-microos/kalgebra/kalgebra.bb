SUMMARY = "Math Expression Solver and Plotter"
DESCRIPTION = "KAlgebra is a math expression solver and plotter."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kalgebra-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "14caf8cca70c151270135986d753991c4fda5d579c5eb399677974eb45ceb1191764dc38c6a8ef9609ebce602e25db53b57bb14e535aeb26052f1600b140a028"

RPROVIDES:${PN} += "application() application(org.kde.kalgebra.desktop) kalgebra kalgebra(aarch-64) kalgebra5 metainfo() metainfo(org.kde.kalgebra.appdata.xml) mimehandler(application/x-kalgebra)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libAnalitza.so.8()(64bit) libAnalitzaGui.so.8()(64bit) libAnalitzaPlot.so.8()(64bit) libAnalitzaWidgets.so.8()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libreadline.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(org.kde.analitza.1) qt5qmlimport(org.kde.plasma.components.2)"

inherit rpm
