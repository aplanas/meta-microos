SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql14-pg_cron-1.5.2-1.1.aarch64.rpm"
RPM_HASH = "97fad8ba2c00d2d12284316345a131c9d04750cb061497007618f8272319ec48a057bc1b70bbec8f7469b6d4f76a0e1f89e466e16651c86e54416fe30c921ee8"

RPROVIDES:${PN} += "postgresql14-pg_cron postgresql14-pg_cron(aarch-64) postgresql14-pg_cron-llvmjit"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) postgresql14-server"

inherit rpm
