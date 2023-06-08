SUMMARY = "Plasma library and runtime components based upon KF5 and Qt5"
DESCRIPTION = "Plasma library and runtime components based upon KF5 and Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "plasma-framework-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "31785ca5418e23d36e004cc1da54801e0c4821f99f97d277cfd8874a4f0129f4b5d4a90bd117038038bef641fddf094a37d5b2f79e7ba80f81f9af91b0a6453a"

RPROVIDES:${PN} += "plasma-framework plasma-framework(aarch-64) plasma-framework-private"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Activities.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Declarative.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Kirigami2.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Package.so.5()(64bit) libKF5Plasma.so.5()(64bit) libKF5PlasmaQuick.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
