SUMMARY = "KDE's hotkey daemon"
DESCRIPTION = "KDE's hotkey daemon module. It allows you to configure custom \
keyboard shortcuts and mouse gestures."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "khotkeys5-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "81bbd47533eaa5ead9d35d4137f169facb77f9fb539ea79a1339369478bcde91b9eb738f59bc962852dedd39e5eb56980313697faa58488d5265c0b3cf465b20"

RPROVIDES:${PN} += "khotkeys5 khotkeys5(aarch-64) libkhotkeysprivate.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KDELibs4Support.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libXtst.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libkworkspace5.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libqt5-qdbus libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
