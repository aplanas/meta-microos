SUMMARY = "KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects. \
 \
Main kpmcore library."
LICENSE = "GPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "libkpmcore12-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f528d2ff0a8f6b1abd941666a3ac78c9099e8201afcf833ed739d042b88953dd1ac70ba8fbbc76e89e54ee983f7e377933bc62c06444e5d3069c4edd6bd3a508"

RPROVIDES:${PN} += "libkpmcore.so.12()(64bit) libkpmcore12 libkpmcore12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig kpmcore ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_2.15)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
