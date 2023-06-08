SUMMARY = "KDE BitTorrent Client"
DESCRIPTION = "KTorrent is a BitTorrent application by KDE which allows you to download files \
using the BitTorrent protocol. It enables you to run multiple torrents at the \
same time and comes with extended features to make it a full-featured client \
for BitTorrent."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ktorrent-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "f9af759f8217c1343773211be6f34e12ece4ea6a78dd07b52c6081a3c9d867d74281a9df4a8ffabfbd66ff01cdbfd2300bf440cecb8758457363518f08a81ab3"

RPROVIDES:${PN} += "application() application(org.kde.ktorrent.desktop) ktorrent ktorrent(aarch-64) libktcore.so.16()(64bit) metainfo() metainfo(org.kde.ktorrent.appdata.xml) mimehandler(application/x-bittorrent) mimehandler(application/x-torrent) mimehandler(x-scheme-handler/magnet)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5DNSSD.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5Plotting.so.5()(64bit) libKF5Syndication.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5Torrent.so.6()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5WebEngineCore.so.5()(64bit) libQt5WebEngineCore.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libkworkspace5.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libphonon4qt5.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtag.so.1()(64bit)"

inherit rpm
