SUMMARY = "Math Expression Solver and Plotter"
DESCRIPTION = "KAlgebra is a math expression solver and plotter."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kalgebra-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "60bea48346b7b163405eff5c426e786b9d24f65152addceb6616bfd3071a5d5687bf641165f9ea1208f762ccb5a5b08298832dfdf85eb74901b248f4b31d59f0"

RPROVIDES:${PN} += "application() application(org.kde.kalgebra.desktop) kalgebra kalgebra(aarch-64) kalgebra5 metainfo() metainfo(org.kde.kalgebra.appdata.xml) mimehandler(application/x-kalgebra)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libAnalitza.so.8()(64bit) libAnalitzaGui.so.8()(64bit) libAnalitzaPlot.so.8()(64bit) libAnalitzaWidgets.so.8()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libreadline.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(org.kde.analitza.1) qt5qmlimport(org.kde.plasma.components.2)"

inherit rpm
