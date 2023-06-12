SUMMARY = "File manager plugin"
DESCRIPTION = "A File manager plugin to launch a file transfer job with a specified contact"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-send-file-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4b5872d247e4c68f95d38e91bc7762cee57f04ba1b5e6a945bc23c09c44f12a385282c55c0b747ebd1bb0be02dea75d5d73a0f199ac45b4cf1642b4e676284d0"

RPROVIDES:${PN} += "ktp-send-file ktp-send-file(aarch-64) ktp-send-file5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKTpCommonInternals.so.9()(64bit) libKTpModels.so.9()(64bit) libKTpWidgets.so.9()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtelepathy-qt5.so.0()(64bit)"

inherit rpm
