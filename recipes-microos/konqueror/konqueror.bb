SUMMARY = "KDE File Manager and Browser"
DESCRIPTION = "Konqueror allows you to manage your files and browse the web in a \
unified interface."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "konqueror-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "764311e398f3736063285611ab79dde839145d9260348ce07548c5dbf2310f3361fb456a90c5d5d6d1ed51f3d5e5d3e5c9f5105d4d74fd561c473c8c6ef2fc11"

RPROVIDES:${PN} += "application() application(kfmclient.desktop) application(kfmclient_dir.desktop) application(kfmclient_html.desktop) application(kfmclient_war.desktop) application(konqbrowser.desktop) application(org.kde.konqueror.desktop) config(konqueror) kde-baseapps-libkonq kde-baseapps5-libkonq konqueror konqueror(aarch-64) konqueror-libkonq libKF5Konq.so.6()(64bit) libKF5Konq6 libkdeinit5_kfmclient.so()(64bit) libkdeinit5_konqueror.so()(64bit) libkonquerorprivate.so.5()(64bit) metainfo() metainfo(org.kde.konqueror.appdata.xml) mimehandler(application/x-webarchive) mimehandler(application/xhtml+xml) mimehandler(application/xml) mimehandler(inode/directory) mimehandler(text/html) mimehandler(x-scheme-handler/http) mimehandler(x-scheme-handler/https)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5Bookmarks.so.5()(64bit) libKF5Codecs.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5SonnetUi.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libz.so.1()(64bit) webenginepart"

inherit rpm
