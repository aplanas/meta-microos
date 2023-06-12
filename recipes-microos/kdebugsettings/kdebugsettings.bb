SUMMARY = "Program to set debug verbosity for KDE applications"
DESCRIPTION = "This program allows to tune the debug output of KDE applications, ranging \
from verbose to completely silent."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdebugsettings-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "451fd39eb774beacb87b76737e1d01faa0bd48ca258266e2f4d50a26309207942372d02cadf33f9f0b1ea84da20c4dc49477a0bbb4da7e97c3d9106dbcee4533"

RPROVIDES:${PN} += "application() application(org.kde.kdebugsettings.desktop) kdebugsettings kdebugsettings(aarch-64) kdebugsettings5 libkdebugsettings.so.5()(64bit) metainfo() metainfo(org.kde.kdebugsettings.appdata.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
