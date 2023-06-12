SUMMARY = "Kirigami TV guide"
DESCRIPTION = "Telly Skout is a convergent Kirigami TV guide. It shows the TV program for your \
favorite channels from TV Spielfilm or an XMLTV file."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "telly-skout-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "7e00cc258bbc90913883bf83eed634f843cc02460f42ad7ebb8e42ad6c99b3d266023d0c1363e3c05f714454bb70e5f509ab21a89b8a8574d7481c84f657892b"

RPROVIDES:${PN} += "application() application(org.kde.telly-skout.desktop) metainfo() metainfo(org.kde.telly-skout.appdata.xml) mimehandler(application/x-telly-skout) telly-skout telly-skout(aarch-64)"
RDEPENDS:${PN} += "kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
