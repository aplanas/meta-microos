SUMMARY = "A distraction-free Markdown editor"
DESCRIPTION = "ghostwriter is a text editor for Markdown, which is a plain text \
markup format. For more information about Markdown, please visit John \
Gruber’s website at http://www.daringfireball.net. ghostwriter \
provides a relaxing, distraction-free writing environment."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "ghostwriter-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "0c039f017bc79cc20cc127e55d4666d51bfb843ed62e681025a58bb73ba9f22564b8eb033773335d76f663e40686a870904187779231c8a072d1e03ffc313261"

RPROVIDES:${PN} += "application() application(org.kde.ghostwriter.desktop) ghostwriter ghostwriter(aarch-64) metainfo() metainfo(org.kde.ghostwriter.metainfo.xml) mimehandler(text/markdown) mimehandler(text/plain) mimehandler(text/x-markdown)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5SonnetCore.so.5()(64bit) libKF5SonnetUi.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5WebChannel.so.5()(64bit) libQt5WebChannel.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
