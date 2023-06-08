SUMMARY = "Battleship game"
DESCRIPTION = "KBatteship is a KDE implementation of the popular game 'Battleship' where \
you have to try to sink the opponents ships. The game can also be \
played with friends online via the internet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "knavalbattle-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "13ab649ca0a26394bf4cfc8668168fd2325989ea6ab83c78f95de0bb31a24a726983d926312de00428d63b8bb35c60eb7bf5783ff188c1a03e08619c71d5d921"

RPROVIDES:${PN} += "application() application(org.kde.knavalbattle.desktop) knavalbattle knavalbattle(aarch-64) knavalbattle5 metainfo() metainfo(org.kde.knavalbattle.appdata.xml) mimehandler(inode/vnd.kde.service.knavalbattle) mimehandler(x-scheme-handler/kbattleship)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5DNSSD.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
