SUMMARY = "Timer for various types of tea"
DESCRIPTION = "Timer utility by KDE where the user can select a particular type of tea, \
and be reminded when the associated hardcoded time is over."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kteatime-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "b6302ca0f653b42fa9480004da646349d3c2bf8b4f879f5a33131db77565dec749b2ec25175d6cfd46b9130531a469dbc9a10f039760071e95d753878da79388"

RPROVIDES:${PN} += "application() application(org.kde.kteatime.desktop) kteatime kteatime(aarch-64) kteatime5 metainfo() metainfo(org.kde.kteatime.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
