SUMMARY = "KDE Translation Editor"
DESCRIPTION = "This package contains lokalize, an editor for translations"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "lokalize-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "df27f7b1128f6c369381c44567ea1992f9b57b2a838d0322b20043f241b697a420c8246f2842babd92136cea69f901e61efb1fe02fd652c865ded08ba92da6db"

RPROVIDES:${PN} += "application() application(org.kde.lokalize.desktop) lokalize lokalize(aarch-64) lokalize5 metainfo() metainfo(org.kde.lokalize.appdata.xml) mimehandler(application/x-lokalize-project) mimehandler(application/x-xliff) mimehandler(text/x-gettext-translation) mimehandler(text/x-gettext-translation-template)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5SonnetCore.so.5()(64bit) libKF5SonnetUi.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libhunspell-1.7.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
