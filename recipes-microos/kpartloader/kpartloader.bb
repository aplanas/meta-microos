SUMMARY = "Development tool to test KParts"
DESCRIPTION = "kpartloader is a debugging tool used to test \
loading of KParts."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "kpartloader-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "867a137a9328d7e2e175675eb40bcdece9515f4b5ccf8407f22035e64460222a90eb45af3127e8197beeb7da97c8d923a99405a6065ee7d9fcd17f75d1796092"

RPROVIDES:${PN} += "kpartloader kpartloader(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
