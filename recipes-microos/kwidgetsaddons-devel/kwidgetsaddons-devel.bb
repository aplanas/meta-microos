SUMMARY = "Large set of desktop widgets: Build Environment"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module. If you are porting applications from \
KDE Platform 4 'kdeui' library, you will find many of its classes here. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kwidgetsaddons-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "1678ab93fbfc821a864a7378731a54a7668296ddda2c11c01bf6ebe78176eff280dbe4e0dd06b7ed4a63955065c25308b7ef3a8d1ee3cc1663a5db15ac3eb849"

RPROVIDES:${PN} += "cmake(KF5WidgetsAddons) kwidgetsaddons-devel kwidgetsaddons-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Widgets) extra-cmake-modules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WidgetsAddons5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
