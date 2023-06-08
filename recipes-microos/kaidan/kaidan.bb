SUMMARY = "A XMPP client based on KDE Framework"
DESCRIPTION = "Kaidan is a simple Jabber/XMPP client providing a user-interface using \
Kirigami and QtQuick. The back-end of Kaidan is entirely written in C++ \
using the qxmpp XMPP client library and Qt 5."
LICENSE = "GPL-3.0-or-later & SUSE-GPL-3.0+-with-openssl-exception & MIT & AML & CC-BY-SA-4.0"

PV = "0.9.0"

RPM_NAME = "kaidan-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "a823aabd63ddabb5d9ebb9eac8e1baee8b5a08649e196d4eaf42f8d76feee7af1d3b40256f15a6ce580c9d4420dc4cad381e268d28a1258eae9a60f39eed7b61"

RPROVIDES:${PN} += "application() application(im.kaidan.kaidan.desktop) kaidan kaidan(aarch-64) metainfo() metainfo(im.kaidan.kaidan.appdata.xml) mimehandler(x-scheme-handler/xmpp)"
RDEPENDS:${PN} += "kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Notifications.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Positioning.so.5()(64bit) libQt5Positioning.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libZXing.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libqt5-qtquickcontrols2 libqxmpp.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
