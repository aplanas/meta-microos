SUMMARY = "Shisen-Sho Mahjongg-like game"
DESCRIPTION = "Shisen-Sho (KShishen) is a game similar to Mahjongg. The object of the \
game is to remove all tiles from the field. This is done by removing \
two tiles with of the same type until no tile is left."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kshisen-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "dd283e26934051935e813cdffdd1f9e48e16d1d077e36ac3121df680d7f3261f3f4b9ca67bff31703f4d27406396010452fd61047e9b38d13a8faf152794d0e5"

RPROVIDES:${PN} += "application() application(org.kde.kshisen.desktop) kshisen kshisen(aarch-64) kshisen5 metainfo() metainfo(org.kde.kshisen.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5KMahjongglib.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
