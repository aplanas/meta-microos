SUMMARY = "Countdown Launcher"
DESCRIPTION = "Countdown launching tool by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktimer-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "44c8a1194c2daad0059951eda91c5217fd06bb5fe2be726e5a5b16ff6a363feddd302a4a5b8dfb1e850803befcce806f2431c2c019b6e83371f5fba2b6169edc"

RPROVIDES:${PN} += "application() \
application(org.kde.ktimer.desktop) \
ktimer \
ktimer(aarch-64) \
ktimer5 \
metainfo() \
metainfo(org.kde.ktimer.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
