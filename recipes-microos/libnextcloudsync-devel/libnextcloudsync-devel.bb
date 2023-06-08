SUMMARY = "Development files for the Nextcloud synchronisation library"
DESCRIPTION = "Development files for the Nextcloud Desktop Client synchronisation \
library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.1"

RPM_NAME = "libnextcloudsync-devel-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "fdc5b58a53f8aa6fbc1450cbb980a940f03101d0ea3aedc07f6cb3ac67d5b535cf4a0f1d746a3d08c2b86649dcc128ed6ad639d99fd6d3e5bacf720152206d3b"

RPROVIDES:${PN} += "libnextcloudsync-devel libnextcloudsync-devel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libnextcloud_csync.so.0()(64bit) libnextcloudsync.so.0()(64bit) libnextcloudsync0 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
