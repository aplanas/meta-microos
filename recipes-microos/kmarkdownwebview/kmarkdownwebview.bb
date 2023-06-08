SUMMARY = "KPart for rendering Markdown content"
DESCRIPTION = "This package allows KDE applications which use it to obtain a live preview of HTML-rendered Markdown content."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.6"

RPM_NAME = "kmarkdownwebview-0.5.6-1.12.aarch64.rpm"
RPM_HASH = "180bcbf4cdddd7d14edc84867fba0666aa6cd674fc6c24cab261029e8e4fa193a02eb4d41c8bdde21d69f006c38f32d261c156290bffe2c764619a7e02ac9885"

RPROVIDES:${PN} += "kmarkdownwebview kmarkdownwebview(aarch-64) libKMarkdownWebView.so()(64bit) metainfo() metainfo(org.kde.kmarkdownwebviewpart.metainfo.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5WebChannel.so.5()(64bit) libQt5WebChannel.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
