SUMMARY = "A backup and sync tool"
DESCRIPTION = "luckyBackup is an application that backs-up and/or synchronizes any directories \
with rsync. \
 \
It checks all declared directories before proceeding with any data \
manipulation, and, by way of rsync, transfers only changes and not \
all data."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "luckybackup-0.5.0-1.24.aarch64.rpm"
RPM_HASH = "5f025798cddc5cbc1d546fd1e92e48d1fe558d7ee7bb65b2d56c2c03388563eb3643957f88e20220a58f6b7cb7c9208a2c19d4f003d40060ffcc7a0ec5165787"

RPROVIDES:${PN} += "application() application(luckybackup-su.desktop) application(luckybackup.desktop) luckybackup luckybackup(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) polkit rsync"

inherit rpm
