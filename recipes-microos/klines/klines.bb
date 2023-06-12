SUMMARY = "Tactical game"
DESCRIPTION = "Klines is the KDE version of the russian game Lines where you have to \
align five game pieces of the same colour in one line to remove them \
from the game board. Similar to tetris you fight new pieces appearing."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "klines-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "6ca80a34d56b4c198624577eb2421105097c2fb13c1348f0a97a70bc4eab1c08e47e8a78bf6dd8d080c41290c374b985ac1148bcfe17b7bedf4890c80a5875bf"

RPROVIDES:${PN} += "application() \
application(org.kde.klines.desktop) \
klines \
klines(aarch-64) \
klines5 \
metainfo() \
metainfo(org.kde.klines.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KDEGames.so.7()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
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
