SUMMARY = "Vocabulary Trainer"
DESCRIPTION = "Parley is a vocabulary trainer by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "parley-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "8d7f1713b2ef044426c9a67608885ec4b58ada53c44835fbcd9f9ed01501b62748a605e3ccbbb21028ec3bb3c42003b5979bcb1bd9c576eb2918e5eb740b7f36"

RPROVIDES:${PN} += "application() application(org.kde.parley.desktop) metainfo() metainfo(org.kde.parley.appdata.xml) mimehandler(application/x-kvtml) parley parley(aarch-64) parley5"
RDEPENDS:${PN} += "kdeedu-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKEduVocDocument.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5NewStuffWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5SonnetCore.so.5()(64bit) libKF5SonnetUi.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libxml2.so.2()(64bit)"

inherit rpm
