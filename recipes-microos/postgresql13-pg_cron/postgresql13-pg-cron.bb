SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql13-pg_cron-1.5.2-1.2.aarch64.rpm"
RPM_HASH = "969d39eaed4721ca6fd4be78ac4a3af79f4f814adbcd495aeb434bfeb8faa7da23b41d44428182d9ff4b0cfc64d8a552eb92d458261ac5533e7c1049b0aab7df"

RPROVIDES:${PN} += "postgresql13-pg_cron postgresql13-pg_cron(aarch-64) postgresql13-pg_cron-llvmjit"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) postgresql13-server"

inherit rpm
