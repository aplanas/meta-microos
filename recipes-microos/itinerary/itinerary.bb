SUMMARY = "Itinerary and boarding pass management application"
DESCRIPTION = "Itinerary and boarding pass management application."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "itinerary-23.04.0-2.1.aarch64.rpm"
RPM_HASH = "571ba1ca3d0b46dff035218eea1b9af429e1ab02577a3b13c42d2aec7ee408e5fca6bfdf52710778a7421fa33a8b37e9f6cfc48f7b5fc6b43c0d60a7d8364407"

RPROVIDES:${PN} += "application() application(org.kde.itinerary.desktop) itinerary itinerary(aarch-64) libSolidExtras.so()(64bit) libsolidextrasqmlplugin.so()(64bit) metainfo() metainfo(org.kde.itinerary.appdata.xml) mimehandler(application/json) mimehandler(application/ld+json) mimehandler(application/pdf) mimehandler(application/vnd.apple.pkpass) mimehandler(application/vnd.kde.itinerary) mimehandler(message/rfc822) mimehandler(text/calendar) mimehandler(text/html) qt5qmlimport(org.kde.solidextras.1)"
RDEPENDS:${PN} += "breeze5-icons ki18n-imports kirigami2 kopeninghours kosmindoormap kpublictransport ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CalendarCore.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5FileMetaData.so.3()(64bit) libKF5Holidays.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5I18nLocaleData.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5NetworkManagerQt.so.6()(64bit) libKF5Notifications.so.5()(64bit) libKF5UnitConversion.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKOSMIndoorMap.so.1()(64bit) libKPim5Itinerary.so.5()(64bit) libKPim5PkPass.so.5()(64bit) libKPublicTransport.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Positioning.so.5()(64bit) libQt5Positioning.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit) prison-qt5-imports"

inherit rpm
