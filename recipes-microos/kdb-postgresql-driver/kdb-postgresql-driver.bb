SUMMARY = "Database connectivity and creation framework - PostgreSQL driver"
DESCRIPTION = "This package contains the PostgreSQL driver for the Database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-postgresql-driver-3.2.0-7.16.aarch64.rpm"
RPM_HASH = "b40fd19a2a7552e5cae868160cf76e38fc1fa49d6fbb8110a06aa448942b08309d718cedd959a2be4c5de2c4c556d9de5bd30c52db939b1ea5541b6804dcb37c"

RPROVIDES:${PN} += "calligra-kexi-postgresql-driver kdb-postgresql-driver kdb-postgresql-driver(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKDb3.so.4()(64bit) libKF5CoreAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
