SUMMARY = "KDE Terminal"
DESCRIPTION = "Konsole is a terminal emulator for the K Desktop Environment."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "konsole-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "5e706aebb7dbe8664e522f10f4f699f9ac6046c8ed9bb77cc0557ceafc1235e79c9d257772a86a2383d7539e80db7a42804580a99466669df6e643dd25c3b5f2"

RPROVIDES:${PN} += "application() application(konsolesu.desktop) application(org.kde.konsole.desktop) konsole konsole(aarch-64) konsole5 libkonsoleapp.so.1()(64bit) metainfo() metainfo(org.kde.konsole.appdata.xml)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig konsole-part ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkonsoleprivate.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
