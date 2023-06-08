SUMMARY = "KDE Find File Utility"
DESCRIPTION = "KFind allows you to search for directories and files."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kfind-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "862a79193b69e20a436770599aba40704e234d40955d548260f806a6469451bf6ce14c7edc1b2ac91d8f9f6f93709d65390e2db2db9e52524823f9415a8f5d94"

RPROVIDES:${PN} += "application() application(org.kde.kfind.desktop) kfind kfind(aarch-64) metainfo() metainfo(org.kde.kfind.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5FileMetaData.so.3()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
