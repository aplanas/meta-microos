SUMMARY = "KDE Power Management module"
DESCRIPTION = "KDE Power Management module. Provides kded daemon, \
DBus helper and KCM for configuring Power settings."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "powerdevil5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "84e7571d96bf1eefcb7de422567ed9509dd203a23c22c8f07e09d906b1248a0eaac21b4e8955b447165e80281edecaae4e273fc43a3fc1d2a2e054fbf8762eff"

RPROVIDES:${PN} += "application() \
application(kcm_powerdevilactivitiesconfig.desktop) \
application(kcm_powerdevilglobalconfig.desktop) \
application(kcm_powerdevilprofilesconfig.desktop) \
libpowerdevilconfigcommonprivate.so.5()(64bit) \
libpowerdevilcore.so.2()(64bit) \
libpowerdevilui.so.5()(64bit) \
powerdevil5 \
powerdevil5(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Activities.so.5()(64bit) \
libKF5AuthCore.so.5()(64bit) \
libKF5BluezQt.so.6()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IdleTime.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Kirigami2.so.5()(64bit) \
libKF5NetworkManagerQt.so.6()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Screen.so.8()(64bit) \
libKF5ScreenDpms.so.8()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkworkspace5.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libxcb.so.1()(64bit) \
plasma5-workspace-libs \
systemd"

inherit rpm
