SUMMARY = "Configurable global shortcut support"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent \
of the focused window. Unlike regular shortcuts, the application's window \
does not need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kglobalaccel5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "b4be0ed5a59076ff7b919f8514dd23494c28229e888c5a48b57d64d3d404e7e1c18f7331e9d9f72cb7b60ab877ec53f97150ec6767396f7098f11858d677c34e"

RPROVIDES:${PN} += "kglobalaccel5 kglobalaccel5(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GlobalAccelPrivate.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libxcb-keysyms.so.1()(64bit) libxcb-record.so.0()(64bit) libxcb-xkb.so.1()(64bit) libxcb.so.1()(64bit)"

inherit rpm
