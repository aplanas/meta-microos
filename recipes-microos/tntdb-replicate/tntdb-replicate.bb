SUMMARY = "SQLite plugin for tntdb"
DESCRIPTION = "Replication plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-replicate-1.4-1.12.aarch64.rpm"
RPM_HASH = "9e33751d1c6f758461def69c6e5c7fd4efb9e770d13e21aaed84d8bc1af2e4eaac9172a78cbdddf16baf48b8512ba885120bdc8e3df95fa919488e5a3912ed12"

RPROVIDES:${PN} += "tntdb-replicate tntdb-replicate(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libcxxtools.so.10()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.7)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtntdb.so.5()(64bit)"

inherit rpm
