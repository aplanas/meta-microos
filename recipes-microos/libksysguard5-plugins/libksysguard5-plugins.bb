SUMMARY = "Task management and system monitoring library -- plugins"
DESCRIPTION = "Task management and system monitoring library. This package contains plugins."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libksysguard5-plugins-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "191e3c99f241c24d5455f319ffd5de1eecde2ea4fa58e99c56a786bfe1b6425e74633ab78122a020a66f6469ebc652003d13da54c4d60a4a6e872961c5fa8488"

RPROVIDES:${PN} += "libksysguard5-helper libksysguard5-plugins libksysguard5-plugins(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5AuthCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libksysguard5 libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libpcap.so.1()(64bit) libprocesscore.so.9()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) permissions"

inherit rpm
