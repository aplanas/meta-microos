SUMMARY = "Sokoban-like logic game"
DESCRIPTION = "KAtomic is a thinking game where you have to form chemical molecules \
out of atoms. This is done with a nice graphical interface where you \
can move each atom in a labyrinth."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "katomic-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "b8c4e09b02f5d3cd72ad9ccff54b89ae3bd67063431559f18c26919a006009f4ed292cd06debcb712698128c207d0f91274c23a3e0b928f017e6774b7b0f2352"

RPROVIDES:${PN} += "application() application(org.kde.katomic.desktop) katomic katomic(aarch-64) katomic5 metainfo() metainfo(org.kde.katomic.appdata.xml)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5NewStuffWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
