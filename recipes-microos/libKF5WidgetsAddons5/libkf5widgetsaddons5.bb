SUMMARY = "Large set of desktop widgets"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module. If you are porting applications from \
KDE Platform 4 'kdeui' library, you will find many of its classes here."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5WidgetsAddons5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c6dcb2517f47e5b2cee257999fba7b943d01415fce0a679c179e1d27605cae44ca62ba634470b9057a5f3b292d76a53266e59bd929ada8f5b88196e2cfce51e3"

RPROVIDES:${PN} += "libKF5WidgetsAddons.so.5()(64bit) libKF5WidgetsAddons5 libKF5WidgetsAddons5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Widgets5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
