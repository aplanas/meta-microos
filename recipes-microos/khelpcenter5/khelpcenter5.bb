SUMMARY = "KDE Documentation Application"
DESCRIPTION = "Application to show KDE Applications' documentation."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "khelpcenter5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4b250340b27042d99e8f32bdbfa5a892b937ca288d8247d1bfcbddb0a15960103ef2a6a031920263f88ffc6f373d56501ea49ac67e91960e2c2182348bca7dca"

RPROVIDES:${PN} += "application() application(org.kde.khelpcenter.desktop) khelpcenter5 khelpcenter5(aarch-64) metainfo() metainfo(org.kde.khelpcenter.metainfo.xml) mimehandler(x-scheme-handler/help) mimehandler(x-scheme-handler/info) mimehandler(x-scheme-handler/man) suse_help_viewer"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/perl kdoctools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGrantlee_Templates.so.5()(64bit) libKF5Archive.so.5()(64bit) libKF5Bookmarks.so.5()(64bit) libKF5Codecs.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5DocTools.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KHtml.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxapian.so.30()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
