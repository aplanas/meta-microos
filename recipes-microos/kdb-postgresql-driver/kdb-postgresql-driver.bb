SUMMARY = "Database connectivity and creation framework - PostgreSQL driver"
DESCRIPTION = "This package contains the PostgreSQL driver for the Database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-postgresql-driver-3.2.0-7.17.aarch64.rpm"
RPM_HASH = "bfabf4f2b31ba9eb0ae38c7a4d11ac2be24ad7a10075663155a09e1555b72e90aa344b5ca82500770d450fe4e911ef032d61b156dde5549d261984cf104cad4c"

RPROVIDES:${PN} += "calligra-kexi-postgresql-driver \
kdb-postgresql-driver \
kdb-postgresql-driver(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKDb3.so.4()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
