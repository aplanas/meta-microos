SUMMARY = "KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects. \
 \
Main kpmcore library."
LICENSE = "GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "libkpmcore12-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "5b22c4e12eae5f1741e9ae21c8ea976ba837ba3061d93661051004ac78331f3754f346a80a0bd647575e0f927440bade802865eedc9098885011c4e0eae1e41e"

RPROVIDES:${PN} += "libkpmcore.so.12()(64bit) libkpmcore12 libkpmcore12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig kpmcore ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_2.15)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
