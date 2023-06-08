SUMMARY = "Dolphin overlay icons"
DESCRIPTION = "This package provides the necessary plugin libraries for the \
Dolphin filemanager to display overlay icons."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.1"

RPM_NAME = "nextcloud-desktop-dolphin-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "a7b1b685f4ef09b1bebc649a0d019471614f827ae0b7149e729f40088dc8afaa359ca73eec3c69a3173049c96f37b0262b9c91e1ed4f44289e1f902bdcf6daaf"

RPROVIDES:${PN} += "libnextclouddolphinpluginhelper.so()(64bit) nextcloud-desktop-dolphin nextcloud-desktop-dolphin(aarch-64)"
RDEPENDS:${PN} += "dolphin ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) nextcloud-desktop"

inherit rpm
