SUMMARY = "KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects."
LICENSE = "GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "kpmcore-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "49cb91913b96935596c4c9e2bcfe5d42bbfeef7b76c81742deea4ede3a3a490c61d99bb9a784e4e91348f2ebca6d953d2674c3b4d9f9b61dca70fd2cd10654e5"

RPROVIDES:${PN} += "kpmcore kpmcore(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkpmcore.so.12()(64bit) libpolkit-qt5-core-1.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
