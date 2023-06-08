SUMMARY = "KDE Desktop notifications"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Notifications5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "7d3c81cd780f27dd0edb7001fa1dc98df20d321669a6ee45e4693aaa4e71953e5e43e3168aeb7d51bad2765382f2d1e33f52acccdd7440e046a0a4ef1d797960"

RPROVIDES:${PN} += "libKF5Notifications.so.5()(64bit) libKF5Notifications5 libKF5Notifications5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcanberra.so.0()(64bit) libdbusmenu-qt5.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
