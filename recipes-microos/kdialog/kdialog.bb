SUMMARY = "KDE version of xdialog"
DESCRIPTION = "KDialog can be used to show nice dialog boxes from shell scripts."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdialog-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d63037c286807a2066ff0c2de4cf7e52dcee24f7381ea43ef0bbcf65839cbd751d5ea6cf929896a5f902fa1fee854a646a47fe384a94496d0c24b7d593ed50da"

RPROVIDES:${PN} += "application() application(org.kde.kdialog.desktop) kdialog kdialog(aarch-64) metainfo() metainfo(org.kde.kdialog.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
