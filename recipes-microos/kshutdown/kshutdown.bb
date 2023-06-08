SUMMARY = "Graphical shutdown utility"
DESCRIPTION = "KShutdown is a graphical shutdown utility that works \
with many Desktop Environments. It allows you to turn off \
or suspend a computer at a specified time. It features \
various time and delay options, command-line support, \
and notifications."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "kshutdown-5.2-1.17.aarch64.rpm"
RPM_HASH = "76e36e3fcf1981ed141e032e52209544d604ce1be4152710b7fce01b95ac20f5d85c7499d1c856030272ed0c503a97cb30b94421cff01dcb9c99e07ac86f3f6d"

RPROVIDES:${PN} += "application() application(kshutdown.desktop) kshutdown kshutdown(aarch-64)"
RDEPENDS:${PN} += "/bin/sh hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IdleTime.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) update-desktop-files"

inherit rpm
