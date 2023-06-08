SUMMARY = "The KDE optimized frontend for Marble and several Plasmoids/Wallpapers"
DESCRIPTION = "The KDE frontend for the Marble map viewer. It also includes several plasmoids and wallpapers for Plasma"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "marble-kde-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "fb90008a25312c20bf08018396b68e13d30013cc57c6a7ec8b942fe81957e783571bda02fa99ac34fb8c086b83866c0632a04285460946e93a5bab7199b98491"

RPROVIDES:${PN} += "application() application(org.kde.marble.desktop) marble-frontend marble-kde marble-kde(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmarblewidget-qt5.so.28()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) marble qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.1) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.marble.private.plasma.0) qt5qmlimport(org.kde.plasma.components.2) qt5qmlimport(org.kde.plasma.configuration.2) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.extras.2) qt5qmlimport(org.kde.plasma.plasmoid.2)"

inherit rpm
