SUMMARY = "Reliable PostgreSQL Backup & Restore"
DESCRIPTION = "pgBackRest aims to be a simple, reliable backup and restore system for \
PostgreSQL that can seamlessly scale up to the largest databases and \
workloads. \
 \
The following features are available: \
- Parallel backup & restore \
- Local or remote operation \
- Full, incremental, differential backups \
- Backup rotation & archive expiration \
- Backup integrity \
- Page checksums \
- Backup resume \
- Streaming compression & checksums \
- Delta restore \
- Parallel, asynchronous WAL push & get \
- Tablespace & link support \
- Amazon S3 support \
- Encryption \
- Compatibility with PostgreSQL >= 8.3"
LICENSE = "MIT"

PV = "2.45"

RPM_NAME = "pgbackrest-2.45-1.1.aarch64.rpm"
RPM_HASH = "3f6c8970ddfc1ff63a0f3695df1a3a290ad14ead6ec16ef021356f28559fdb423dd51ea967a8b84ae6d578a06c4a96c17f41ab9f7624fb543eb67242656c182e"

RPROVIDES:${PN} += "config(pgbackrest) pgbackrest pgbackrest(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) liblz4.so.1()(64bit) libpq.so.5()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit) postgresql-server"

inherit rpm
