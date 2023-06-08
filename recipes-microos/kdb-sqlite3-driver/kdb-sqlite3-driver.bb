SUMMARY = "Database connectivity and creation framework - SQLite3 driver"
DESCRIPTION = "This package contains the SQLite3 driver for the Database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-sqlite3-driver-3.2.0-7.16.aarch64.rpm"
RPM_HASH = "5449dd5edf7be426d25e555c4814ab77f2c2255b7790e02a9cb490f77c14f2b597cae802ede8a33860c22ac77e639b816870aa06b9168c00f70526956870e8ea"

RPROVIDES:${PN} += "calligra-kexi-sqlite3-driver kdb-sqlite3-driver kdb-sqlite3-driver(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKDb3.so.4()(64bit) libKF5CoreAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
