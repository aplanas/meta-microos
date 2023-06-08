SUMMARY = "Weather application for Plasma"
DESCRIPTION = "A convergent weather application for Plasma. Has flat and dynamic/animated \
views for showing forecasts and other information."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kweather-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "5a76d08f102efcc5cd5444abe1bde73cbaff9a6359edd2692b9fc845ffe2168a821d2bd6de9a4d7566b06c0d2b2376aeb9210668f3bb5f3888b88812ebc6341f"

RPROVIDES:${PN} += "application() application(org.kde.kweather.desktop) kweather kweather(aarch-64) metainfo() metainfo(org.kde.kweather.appdata.xml) metainfo(org.kde.plasma.kweather_1x4.appdata.xml)"
RDEPENDS:${PN} += "kirigami-addons kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KWeatherCore.so.5()(64bit) libKF5Plasma.so.5()(64bit) libQt5Charts.so.5()(64bit) libQt5Charts.so.5(Qt_5)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.plasma.plasmoid.2)"

inherit rpm
