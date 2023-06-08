SUMMARY = "Database connectivity and creation framework - MySQL driver"
DESCRIPTION = "This package contains the MySQL driver for the Database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-mysql-driver-3.2.0-7.16.aarch64.rpm"
RPM_HASH = "02f0df4145c738220cc4fb56d295038f8b4db2b423aa41f3ab91b091a79b8541129fc6cec9e750271e360ba2b7e5453b6e3210b9d36bcdbc634c2acf203d1c6a"

RPROVIDES:${PN} += "calligra-kexi-mysql-driver kdb-mysql-driver kdb-mysql-driver(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKDb3.so.4()(64bit) libKF5CoreAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
