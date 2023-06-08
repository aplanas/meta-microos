SUMMARY = "QT/KF5 backend for xdg-desktop-portal"
DESCRIPTION = "A Qt/KF5 backend implementation for xdg-desktop-portal"
LICENSE = "LGPL-2.1-or-later"

PV = "5.27.4"

RPM_NAME = "xdg-desktop-portal-kde-5.27.4-1.2.aarch64.rpm"
RPM_HASH = "887a728e326b417dda64bb477342852f01f7486e37d552b876c700951941351894d0592882e8bb6d4bb62c48ece32b31ffa868413c7bea8f7fb4b645f020328f"

RPROVIDES:${PN} += "application() application(org.freedesktop.impl.portal.desktop.kde.desktop) xdg-desktop-portal-kde xdg-desktop-portal-kde(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WaylandClient.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwayland-client.so.0()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit) xdg-desktop-portal"

inherit rpm
