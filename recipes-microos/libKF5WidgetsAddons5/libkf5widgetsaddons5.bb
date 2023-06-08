SUMMARY = "Large set of desktop widgets"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module. If you are porting applications from \
KDE Platform 4 'kdeui' library, you will find many of its classes here."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5WidgetsAddons5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "1e356ea8d2aec980bd29e2e21f3cc30db603926e6437289d889beee08c85108573652b77c47a3035248ea80e5b6d1113e71679c0f827585b6d51079205e3a038"

RPROVIDES:${PN} += "libKF5WidgetsAddons.so.5()(64bit) libKF5WidgetsAddons5 libKF5WidgetsAddons5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Widgets5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
