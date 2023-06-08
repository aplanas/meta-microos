SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Plasma Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "GPL-2.0+"

PV = "5.27.4"

RPM_NAME = "plasma5-integration-plugin-5.27.4-1.2.aarch64.rpm"
RPM_HASH = "a833ef32e141cc96ef05cd8b071c5660e23dcb0348b03c223feccf6f98b6187a965446edb8a262c379ee2ee8c2b0876e7f97c242e258180482a14b7675e339ff"

RPROVIDES:${PN} += "plasma5-integration-plugin plasma5-integration-plugin(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl hack-fonts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Gui5 libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5WaylandClient.so.5()(64bit) libQt5WaylandClient.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libXcursor.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwayland-client.so.0()(64bit) libxcb.so.1()(64bit) noto-sans"

inherit rpm
