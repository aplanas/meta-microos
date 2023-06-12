SUMMARY = "A graphical IRC client by KDE"
DESCRIPTION = "Konversation is an Internet Relay Chat (IRC) client built on the \
KDE Platform. \
 \
Features: \
 \
 SSL server support \
 Bookmarking support \
 Multiple servers and channels in one single window \
 DCC file transfer \
 Multiple identities for different servers \
 Text decorations and colors \
 OnScreen Display for notifications \
 Automatic UTF-8 detection \
 Per channel encoding support \
 Theme support for nick icons"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "konversation-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ee410821bf4a795fc7822c4b49f75398a913621930394c791ffeb440922639d94d16ddea9ebba79bdd58bd901d758a3983029f9a554637233160fe19edcab8e4"

RPROVIDES:${PN} += "application() application(org.kde.konversation.desktop) konversation konversation(aarch-64) metainfo() metainfo(org.kde.konversation.appdata.xml) mimehandler(x-scheme-handler/irc) mimehandler(x-scheme-handler/ircs)"
RDEPENDS:${PN} += "/usr/bin/env /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5Bookmarks.so.5()(64bit) libKF5Codecs.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IdleTime.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5NewStuffWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5Wallet.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libqca-qt5.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
