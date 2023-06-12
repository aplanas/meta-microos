SUMMARY = "PAM module to report most recent login of users"
DESCRIPTION = "The liblastlog2 provides various interfaces to read, write or modify the lastlog 2 database."
LICENSE = "BSD-2-Clause"

PV = "1.1.0"

RPM_NAME = "liblastlog2-1-1.1.0-2.1.aarch64.rpm"
RPM_HASH = "210aacd2dee06207cd6fd898239020b705444af27a33ce75bd244a06c91ef70d7563a08e1cd14cb76c7f3771c0ab0de0a846030325a016fb5286781ad5e56478"

RPROVIDES:${PN} += "liblastlog2-1 \
liblastlog2-1(aarch-64) \
liblastlog2.so.1()(64bit) \
liblastlog2.so.1(LIBLASTLOG2_1.0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
