SUMMARY = "KDE Terminal"
DESCRIPTION = "Konsole is a terminal emulator for the K Desktop Environment."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "konsole-23.04.1-1.2.aarch64.rpm"
RPM_HASH = "0836e888023a80251aa55651dac933e89f7333eb7975bb9b69d4a42f9f55a5c191a46d6724e9675eaa23632421da335533595a8fd728f81d00086fdbc504077e"

RPROVIDES:${PN} += "application() application(konsolesu.desktop) application(org.kde.konsole.desktop) konsole konsole(aarch-64) konsole5 libkonsoleapp.so.1()(64bit) metainfo() metainfo(org.kde.konsole.appdata.xml)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig konsole-part ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkonsoleprivate.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit)"

inherit rpm
