SUMMARY = "Database connectivity and creation framework - MySQL driver"
DESCRIPTION = "This package contains the MySQL driver for the Database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-mysql-driver-3.2.0-7.17.aarch64.rpm"
RPM_HASH = "e8af733defc9f02f3a3e1f09c815e9fca3bd0b2ab36bfee65e839f0de4bf71c393fa92bdb0a2006fea6dced8159bbc179eea5d1b529104eeddb5d9f9fb99a574"

RPROVIDES:${PN} += "calligra-kexi-mysql-driver kdb-mysql-driver kdb-mysql-driver(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKDb3.so.4()(64bit) libKF5CoreAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
