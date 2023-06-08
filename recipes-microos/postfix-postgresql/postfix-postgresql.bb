SUMMARY = "Postfix plugin to support PostgreSQL maps"
DESCRIPTION = "Postfix plugin to support PostgreSQL maps. This library will be loaded \
by starting postfix if you'll access a postmap which is stored in \
PostgreSQL."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-postgresql-3.8.0-2.1.aarch64.rpm"
RPM_HASH = "16e2187edf606780a8aa80422be5ed81bda550008f2385e6a299daaea634a27bd09661f0e3af13cafe195e927f88662487592d7f0d79658d11359ffd9fdaa557"

RPROVIDES:${PN} += "postfix-postgresql postfix-postgresql(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) postfix"

inherit rpm
