SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql11-pg_cron-1.5.2-1.1.aarch64.rpm"
RPM_HASH = "23f7c1e722de26d1f1185bef0300eadd3e3938c78126d85c3eecc5a2d19b6d1cca91410a38a991a554a8e8f3f78203576df97d1dfda7cbb2d12a158ec0ed4934"

RPROVIDES:${PN} += "postgresql11-pg_cron postgresql11-pg_cron(aarch-64) postgresql11-pg_cron-llvmjit"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) postgresql11-server"

inherit rpm
