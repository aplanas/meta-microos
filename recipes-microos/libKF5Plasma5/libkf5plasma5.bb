SUMMARY = "Plasma framework - core libraries"
DESCRIPTION = "This package contains the core libraries needed by the Plasma framework."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Plasma5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "c21ad135439aee8c03b3c39bf69d48c39749263cbeffd8879feaabeeee8e0613b83e8e3bf770f3bc065d910bba422cf3a561f6b502f6aa258d5a7eb33f6f3285"

RPROVIDES:${PN} += "libKF5Plasma.so.5()(64bit) libKF5Plasma5 libKF5Plasma5(aarch-64) libKF5PlasmaQuick.so.5()(64bit) qt5qmlimport(org.kde.plasma.configuration.2) qt5qmlimport(org.kde.plasma.plasmoid.2)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Declarative.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Package.so.5()(64bit) libKF5QuickAddons.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WaylandClient.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libxcb-shape.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
