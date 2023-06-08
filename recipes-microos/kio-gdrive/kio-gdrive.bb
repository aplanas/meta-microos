SUMMARY = "Google Drive KIO slave for KDE applications"
DESCRIPTION = "Google Drive KIO slave for KDE applications. \
KIO GDrive requires a KIO-enabled file manager at runtime, \
otherwise there is no way to setup a Google Drive account. \
This can be Dolphin or Gwenview or Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kio-gdrive-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7b6412f351244bf6a9d1bbdeb6d1cde3863543fcc5700a1b28f533e243660555386016c8c03f4122bc9a2c61a56a09055a69b3fab148eae06e107d6088db7f89"

RPROVIDES:${PN} += "kio-gdrive kio-gdrive(aarch-64) metainfo() metainfo(org.kde.kio_gdrive.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKPim5GAPICore.so.5()(64bit) libKPim5GAPICore5 libKPim5GAPIDrive.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libaccounts-qt5.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libkaccounts.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
