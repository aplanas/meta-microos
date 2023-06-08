SUMMARY = "HTML Image Map Editor"
DESCRIPTION = "A tool to edit image maps of HTML files"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kimagemapeditor-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "89acba3e3fa1ec6cfb1138359ca1502311a9cdd91ae1ee328db256daee52db0987d69b6464991f54afe0f78fa325165cbaab13acf472967ba7c45f77355c74c2"

RPROVIDES:${PN} += "application() application(org.kde.kimagemapeditor.desktop) kimagemapeditor kimagemapeditor(aarch-64) metainfo() metainfo(org.kde.kimagemapeditor.appdata.xml) mimehandler(text/html)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit)"

inherit rpm
