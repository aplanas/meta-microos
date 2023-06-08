SUMMARY = "Space Arcade game"
DESCRIPTION = "KSpaceduel is a space arcade game for two players. However, one player \
can be controlled by the computer. Each player controls a satellite \
that flies around the sun. While doing so both players try not to \
collide with anything but shoot at the other space ship."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kspaceduel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "61643e15b1dbf1c257a7abcf01ad22a049c19f0f70ae7d096beb6922af60c7127b7b2a4341fd91a6adb5bb865f09529aca5d6301492d9a02797f84d32a821975"

RPROVIDES:${PN} += "application() application(org.kde.kspaceduel.desktop) kspaceduel kspaceduel(aarch-64) kspaceduel5 metainfo() metainfo(org.kde.kspaceduel.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
