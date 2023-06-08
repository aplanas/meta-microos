SUMMARY = "Database plugin for Orthanc"
DESCRIPTION = "MySQL/mariadb Database plugin for Orthanc, replaces SQLite database"
LICENSE = "AGPL-3.0-or-later"

PV = "4.3"

RPM_NAME = "orthanc-mysql-4.3-1.15.aarch64.rpm"
RPM_HASH = "3aa67915b185c887a9f66ca12c32239d05d659258a2e21b5d99d79545311f9547493148a11a6319e88905acedac190ec3442e9fd039c2c124cea6e61efe9971e"

RPROVIDES:${PN} += "libOrthancMySQLIndex.so.4.3()(64bit) libOrthancMySQLStorage.so.4.3()(64bit) orthanc-mysql orthanc-mysql(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_filesystem.so.1.82.0()(64bit) libboost_iostreams.so.1.82.0()(64bit) libboost_locale.so.1.82.0()(64bit) libboost_thread.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjsoncpp.so.25()(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) mariadb orthanc"

inherit rpm
