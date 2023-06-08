SUMMARY = "Library for KDE Games"
DESCRIPTION = "This package contains the KDE games library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKF5KDEGames7-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "5e6d61f3af86fbf5ce04773bdecb3ff75ee95a1663f967a2fc39d22c710888fffc76f2b6ca8bb9c6af9d16f76b189507b659ed74c714ef04f8fc280304f9f51f"

RPROVIDES:${PN} += "libKF5KDEGames.so.7()(64bit) libKF5KDEGames7 libKF5KDEGames7(aarch-64) libKF5KDEGamesPrivate.so.7()(64bit) libkf5kdegames6"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DNSSD.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5NewStuffWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libkdegames libkdegames-qt5-imports libopenal.so.1()(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
