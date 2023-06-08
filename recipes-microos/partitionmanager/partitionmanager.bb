SUMMARY = "Easily manage disks, partitions and file systems on your KDE Desktop"
DESCRIPTION = "This software allows you to manage your disks, partitions and \
file systems: Create, resize, delete, copy, backup and restore \
partitions with a large number of supported file systems (ext2/3, \
reiserfs, NTFS, FAT32 and more). It makes use of external \
programs to get its job done, so you might have to install \
additional software (preferably packages from your distribution) \
to make use of all features and get full support for all file \
systems."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "partitionmanager-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d2e559a1370c70ef9f1f1c5c500366ec4dd62a60c2c12c16db18a38ac9085e71aad960f5844e485d09e3d2bd30a975dcf352fd3e4542bdd1bf98aa1d8d2d3111"

RPROVIDES:${PN} += "application() application(org.kde.partitionmanager.desktop) metainfo() metainfo(org.kde.partitionmanager.appdata.xml) partitionmanager partitionmanager(aarch-64) partitionmanager5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpmcore.so.12()(64bit) libpolkit-qt5-core-1.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
