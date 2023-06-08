SUMMARY = "Breakout-like game by KDE"
DESCRIPTION = "KBreakout is the KDE version of a Breakout-like game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kbreakout-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "9e64ae58b43d2ada6e22da314008ce6067ffc55da29f55527a7e56ea1f38ca8e551beb45bbb519506dc0a28b97683a2996cf3c79f369c9a35e51d611d04f228b"

RPROVIDES:${PN} += "application() application(org.kde.kbreakout.desktop) kbreakout kbreakout(aarch-64) kbreakout5 metainfo() metainfo(org.kde.kbreakout.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(org.kde.games.core.0)"

inherit rpm
