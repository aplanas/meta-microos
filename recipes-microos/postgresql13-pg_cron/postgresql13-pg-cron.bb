SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql13-pg_cron-1.5.2-1.1.aarch64.rpm"
RPM_HASH = "6edd4e2ab9e75b9ec37e32853cc222f99e3be715f4de382ee61b1f3d180cc713a73208a61f9dca94a2abb61d0f18cd0abad957acdc86981737ffa33f48601650"

RPROVIDES:${PN} += "postgresql13-pg_cron postgresql13-pg_cron(aarch-64) postgresql13-pg_cron-llvmjit"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) postgresql13-server"

inherit rpm
