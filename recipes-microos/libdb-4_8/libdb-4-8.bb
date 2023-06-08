SUMMARY = "Berkeley DB Database Library Version 4.8"
DESCRIPTION = "The Berkeley DB Database is a programmatic toolkit that provides \
database support for applications. \
 \
This package contains the necessary runtime libraries."
LICENSE = "Sleepycat"

PV = "4.8.30"

RPM_NAME = "libdb-4_8-4.8.30-41.1.aarch64.rpm"
RPM_HASH = "684b933cac9dca0c1ffd5c2845653835071e9818ebbe9334ab6515a992ba25cceb6e76e29a7cdfc411ca1e4701233d2ac4935696d3d9d607f688a29dffe1a3b6"

RPROVIDES:${PN} += "db libdb-4.8.so()(64bit) libdb-4_8 libdb-4_8(aarch-64) libdb_cxx-4.8.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
