SUMMARY = "A simple chess board"
DESCRIPTION = "Knights is KDE's chess frontend. It supports playing local games against \
human players or against chess engines (XBoard and UIC), \
as well as playing online games on FICS server. \
Furthermore, it is possible to watch two different chess engines playing \
against each other."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "knights-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "4ab339439f4e5783504bd96f045fb34f1198ab129d51b3569b5e0e9715d3f4d590d7ed31eb3d31865209444754db76e65f37eda89d5b90c601f7d7a6a28fdd88"

RPROVIDES:${PN} += "application() application(org.kde.knights.desktop) knights knights(aarch-64) metainfo() metainfo(org.kde.knights.appdata.xml)"
RDEPENDS:${PN} += "gnuchess libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5Plasma.so.5()(64bit) libKF5Plotting.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5Wallet.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5TextToSpeech.so.5()(64bit) libQt5TextToSpeech.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
